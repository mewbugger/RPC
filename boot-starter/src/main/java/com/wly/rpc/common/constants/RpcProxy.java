package com.wly.rpc.common.constants;

/**
 * @author BarryCrude
 * @date 2025-01-08 0:58
 * @description: 代理方式枚举类
 */
public enum RpcProxy {

    CG_LIB("cglib");


    public final String name;
    RpcProxy(String type){
        this.name = type;
    }

    public static RpcProxy get(String type){
        for (RpcProxy value : values()) {
            if (value.name.equals(type)) {
                return value;
            }
        }
        return null;
    }
}
