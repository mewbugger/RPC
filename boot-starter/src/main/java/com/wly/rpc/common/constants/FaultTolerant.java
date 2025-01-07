package com.wly.rpc.common.constants;

/**
 * @author BarryCrude
 * @date 2025-01-08 0:56
 * @description: 容灾枚举类
 */
public enum FaultTolerant {

    Failover("failover"),

    FailFast("failFast");

    public final String name;

    FaultTolerant(String type) {
        this.name = type;
    }
}
