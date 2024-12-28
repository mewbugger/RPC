package com.wly.rpc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author BarryCrude
 * @date 2024-12-29 0:43
 * @description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface RpcService {

    /**
     * 指定实现方，默认为实现接口中的第一个
     * @return
     */
    Class<?> serviceInterface() default void.class;

    String version() default "1.0";
}
