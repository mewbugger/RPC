package com.wly.rpc.filter;

/**
 * @author BarryCrude
 * @date 2025-01-18 1:27
 * @description:
 */
public class FilterResponse {
    private final Boolean result;
    private final Exception exception;
    public FilterResponse(Boolean result, Exception exception) {
        this.result = result;
        this.exception = exception;
    }
    public Exception getException() {
        return this.exception;
    }

    public Boolean getResult() {
        return this.result;
    }
}
