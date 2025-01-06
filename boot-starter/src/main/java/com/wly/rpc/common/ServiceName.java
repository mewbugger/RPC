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
@Builder
public class ServiceName {
    private final String name;

    private final String version;

    @Override
    public String toString() {
        return "ServiceName{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ServiceName that = (ServiceName) object;
        return Objects.equals(this.name, that.name) && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.version);
    }

}
