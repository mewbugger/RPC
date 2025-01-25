package com.wly.rpc.invoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author BarryCrude
 * @date 2025-01-26 0:56
 * @description: 简化反射调用过程，将目标对象和目标方法封装在一起，并提供一个统一的 invoke方法来执行方法调用。
 */
public class MethodInvocation {

    private Object o;
    private Method method;

    public MethodInvocation(Object o, Method method) {
        this.o = o;
        this.method = method;
    }

    public Object invoke(Object parameter) throws InvocationTargetException, IllegalAccessException {
        return method.invoke(o, parameter);
    }
}

