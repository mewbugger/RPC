package com.wly.rpc.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author BarryCrude
 * @date 2025-01-26 1:07
 * @description:
 */
public class IpUtil {

    public static String getIp() {
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        return inetAddress.getHostAddress();
    }
}
