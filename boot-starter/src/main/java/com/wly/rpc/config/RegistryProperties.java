package com.wly.rpc.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author BarryCrude
 * @date 2025-01-13 1:11
 * @description:
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ConfigurationProperties(prefix = "rpc.registry")
public class RegistryProperties {
    private String name;
    private String host;
}
