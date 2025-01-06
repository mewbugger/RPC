package com.wly.rpc.common;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author BarryCrude
 * @date 2025-01-07 0:48
 * @description:
 */
public class RpcRequestHolder {
    // 请求ID
    public final static AtomicLong REQUEST_ID_GEN = new AtomicLong(0);

    // 绑定请求
    public static final Map<Long, RpcFuture<RpcResponse>> REQUEST_MAP = new ConcurrentMap<>();

    public static Long getRequestId(){
        if (REQUEST_ID_GEN.longValue() == Long.MAX_VALUE){
            REQUEST_ID_GEN.set(0);
        }
        return REQUEST_ID_GEN.incrementAndGet();
    }
}
