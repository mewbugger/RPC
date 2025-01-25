package com.wly.rpc.utils;

/**
 * @author BarryCrude
 * @date 2025-01-26 1:09
 * @description:
 */
public class IPBuilder {

    private static final String symbol = ":";
    public static String buildIp(String host, Integer port) {
        return host + symbol + port;
    }
}
