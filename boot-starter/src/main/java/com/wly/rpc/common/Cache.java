package com.wly.rpc.common;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author BarryCrude
 * @date 2025-01-07 0:47
 * @description:
 */
public class Cache {
    public static ConcurrentHashMap<ServiceName, List<URL>> SERVICE_URLS = new ConcurrentHashMap<>();

    public static Map<Host, ChannelFuture> CHANNEL_FUTURE_MAP = new HashMap<>();

    public static List<URL> SUBSCRIBE_SERVICE_LIST = new ArrayList<>();

    public static Bootstrap BOOT_STRAP;

    public static Map<String, Object> SERVICE_MAP = new HashMap<>();
}
