package com.wly.rpc.filter;

/**
 * @author BarryCrude
 * @date 2025-01-18 1:26
 * @description:
 */
public interface Filter<T> {

    FilterResponse doFilter(FilterData<T> filterData);
}
