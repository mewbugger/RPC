package com.wly.rpc.config;

import org.springframework.context.annotation.Bean;

/**
 * @author BarryCrude
 * @date 2025-01-13 1:32
 * @description:
 */
public class ProviderConfig {
    @Bean
    public RpcProperties rpcProperties() {
        return new RpcProperties();
    }

    @Bean
    public ProviderPostProcessor providerPostProcessor(RpcProperties rpcProperties) {
        Properties.setPort(rpcProperties.getPort());
        Properties.setRegister(rpcProperties.getRegistry());
        Properties.setInvoke(rpcProperties.getInvoke());
        Properties.setSerialization(rpcProperties.getSerialization());
        Properties.setCorePollSize(rpcProperties.getCorePollSize());
        Properties.setMaximumPoolSize(rpcProperties.getMaximumPoolSize());
        return new ProviderPostProcessor(rpcProperties);
    }
}
