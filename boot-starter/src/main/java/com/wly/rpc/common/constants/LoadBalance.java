package com.wly.rpc.common.constants;

/**
 * @author BarryCrude
 * @date 2025-01-08 0:57
 * @description: 负载均衡枚举类
 */
public enum LoadBalance {

    Round("round");

    public final String name;

    LoadBalance(String type) {
        this.name = type;
    }
}
