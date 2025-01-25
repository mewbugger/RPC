package com.wly.rpc.utils;

/**
 * @author BarryCrude
 * @date 2025-01-26 1:06
 * @description:
 */
public class ServiceNameBuilder {
    public static String buildServiceKey(String serviceName, String serviceVersion) {
        return String.join("$", serviceName, serviceVersion);
    }
}
