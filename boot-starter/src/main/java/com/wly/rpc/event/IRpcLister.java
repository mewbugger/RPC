package com.wly.rpc.event;

/**
 * @author BarryCrude
 * @date 2025-01-16 23:58
 * @description:
 */
public interface IRpcLister<T> {
    void exec(T t);
}
