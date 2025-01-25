package com.wly.rpc.invoke;

import java.lang.reflect.InvocationTargetException;

/**
 * @author BarryCrude
 * @date 2025-01-26 0:26
 * @description:
 */
public interface Invoker {
    Object invoke(Invocation invocation) throws InvocationTargetException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InstantiationException;
}
