package com.wly.rpc.common;

import io.netty.util.concurrent.Promise;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author BarryCrude
 * @date 2025-01-07 0:48
 * @description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RpcFuture <T> {
    private Promise<T> promise;
    private long timeout;
}
