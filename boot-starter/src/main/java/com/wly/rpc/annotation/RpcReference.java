package com.wly.rpc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

/**
 * @author BarryCrude
 * @date 2024-12-29 0:43
 * @description: 用于标记 RPC 客户端的引用
 */
// 注解的生命周期，在运行时保留
@Retention(RetentionPolicy.RUNTIME)
// 注解作用的目标 字段，类或接口
@Target({ElementType.FIELD,ElementType.TYPE})
public @interface RpcReference {
    String version() default "1.0";

    long time() default 3000;

    TimeUnit timeUnit() default TimeUnit.MILLISECONDS;

}
