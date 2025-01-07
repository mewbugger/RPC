package com.wly.rpc.common.constants;

/**
 * @author BarryCrude
 * @date 2025-01-08 0:57
 * @description: 注册中心枚举类
 */
public enum Register {
    ZOOKEEPER("zookeeper");

    public final String name;
    Register(String type) {
        this.name = type;
    }
}
