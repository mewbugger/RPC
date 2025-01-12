package com.wly.rpc.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author BarryCrude
 * @date 2025-01-13 1:33
 * @description: 启用 RPC 服务提供者的相关配置
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
// Spring 容器会自动加载 ProviderConfig 类，从而初始化 RPC 服务提供者所需的 Bean。
@Import(ProviderConfig.class)
public @interface EnableProviderRpc {
}
