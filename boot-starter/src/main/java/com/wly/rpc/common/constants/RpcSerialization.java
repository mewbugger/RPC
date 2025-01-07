package com.wly.rpc.common.constants;

/**
 * @author BarryCrude
 * @date 2025-01-08 0:58
 * @description: 序列化枚举类
 */
public enum RpcSerialization {

    JSON("json"),
    JDK("jdk"),

    HESSIAN("hessian"),

    KRYO("kryo");

    public final String name;
    RpcSerialization(String type){
        this.name = type;
    }

    public static RpcSerialization get(String type){
        for (RpcSerialization value : values()) {
            if (value.name.equals(type)) {
                return value;
            }
        }
        return null;
    }
}
