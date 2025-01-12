package com.wly.rpc.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author BarryCrude
 * @date 2025-01-13 1:29
 * @description:
 */
public class ProviderPostProcessor implements InitializingBean, BeanPostProcessor {
    private RpcProperties rpcProperties;
    // todo
    private final String ip = IpUtil.getIp();
    public ProviderPostProcessor(RpcProperties rpcProperties) {
        this.rpcProperties = rpcProperties;
    }
    @Override
    public void afterPropertiesSet() throws Exception{
        // todo
    }
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        // todo
        return null;
    }
}
