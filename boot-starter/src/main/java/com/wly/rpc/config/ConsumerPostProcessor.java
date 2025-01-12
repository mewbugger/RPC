package com.wly.rpc.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author BarryCrude
 * @date 2025-01-13 1:21
 * @description:  Spring 容器初始化 Bean 的过程中，对带有 @RpcReference 注解的字段做特殊处理。
 */
public class ConsumerPostProcessor implements BeanPostProcessor, InitializingBean {
    RpcProperties rpcProperties;

    public ConsumerPostProcessor(RpcProperties rpcProperties) {
        this.rpcProperties = rpcProperties;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // todo
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        // todo
        return null;
    }


}
