package com.wly.rpc.filter;

/**
 * @author BarryCrude
 * @date 2025-01-18 1:27
 * @description:
 */
public class FilterData<T> {
    private T object;
    public FilterData(T object) {
        this.object = object;
    }
    public T getObject() {
        return this.object;
    }
}
