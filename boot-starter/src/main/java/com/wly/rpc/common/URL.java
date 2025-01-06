package com.wly.rpc.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @author BarryCrude
 * @date 2025-01-07 0:48
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class URL {

    private String ip;

    private Integer port;

    private String serviceName;

    private String version;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        URL url = (URL) object;
        return Objects.equals(ip, url.ip) && Objects.equals(port, url.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, port);
    }

    @Override
    public String toString() {
        return "URL{" +
                "ip='" + ip + '\'' +
                ", port=" + port +
                ", serviceName='" + serviceName + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
