package com.wly.rpc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author BarryCrude
 * @date 2025-01-13 1:14
 * @description:
 */
@Component
public class ConsumerConfig {
    @Bean
    public RpcProperties rpcProperties() {
        return new RpcProperties();
    }
    @Bean
    public ConsumerPostProcessor consumerPostProcessor(RpcProperties rpcProperties) {
        Properties.setPort(rpcProperties.getPort());
        Properties.setRegister(rpcProperties.getRegistry());
        Properties.setSerialization(rpcProperties.getSerialization());
        Properties.setProxy(rpcProperties.getProxy());
        return new ConsumerPostProcessor(rpcProperties);
    }
}
