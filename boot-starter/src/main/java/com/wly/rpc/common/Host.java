package com.wly.rpc.common;


import java.util.Objects;

/**
 * @author BarryCrude
 * @date 2025-01-07 0:48
 * @description:
 */
public class Host {
    private final String ip;
    private final Integer port;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Host ip = (Host)object;
        return Objects.equals(this.ip, ip.ip) && Objects.equals(this.port, ip.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.ip, this.port);
    }

    public Host(String host, Integer port) {
        this.ip = host;
        this.port = port;
    }

    @Override
    public String toString() {
        return "Host{" +
                "ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}
