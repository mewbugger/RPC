package com.wly.rpc.common.constants;

/**
 * @author BarryCrude
 * @date 2025-01-08 0:58
 * @description: 调用方式枚举类
 */
public enum RpcInvoker {

    REFLECTION("reflection");

    public final String name;
    RpcInvoker(String type){
        this.name = type;
    }
}
