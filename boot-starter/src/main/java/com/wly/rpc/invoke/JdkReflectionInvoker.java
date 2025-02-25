package com.wly.rpc.invoke;

import com.wly.rpc.common.Cache;
import com.wly.rpc.utils.ServiceNameBuilder;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author BarryCrude
 * @date 2025-01-26 1:00
 * @description:
 */
public class JdkReflectionInvoker implements Invoker{

    private Map<Integer,MethodInvocation> methodCache = new HashMap<>();

    @Override
    public Object invoke(Invocation invocation) throws InvocationTargetException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InstantiationException {
        final Integer methodCode = invocation.getMethodCode();
        if (!methodCache.containsKey(methodCode)) {
            final String key = ServiceNameBuilder.buildServiceKey(invocation.getClassName(), invocation.getServiceVersion());
            Object bean = Cache.SERVICE_MAP.get(key);
            final Class<?> aClass = bean.getClass();

            final Method method = aClass.getMethod(invocation.getMethodName());
            methodCache.put(methodCode, new MethodInvocation(bean, method));
        }
        final MethodInvocation methodInvocation = methodCache.get(methodCode);
        return methodInvocation.invoke(invocation.getParameter());
    }
}
