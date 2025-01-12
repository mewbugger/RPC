package com.wly.rpc.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author BarryCrude
 * @date 2025-01-13 1:14
 * @description:
 */
@Component
@ConfigurationProperties(prefix = "rpc")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RpcProperties {
    private Integer port;
    private String serialization;
    private String proxy;
    private String invoke;
    private RegistryProperties registry;
    private int corePollSize = 5;
    private int maximumPoolSize = 10;
}
