package com.wly.rpc.event;

/**
 * @author BarryCrude
 * @date 2025-01-17 0:26
 * @description:
 */
public class DestroyEventData implements RpcEventData{
    private Object data;

    public DestroyEventData(Object data) {this.data = data;}
    @Override
    public void setData(Object o) {
        this.data = o;
    }

    @Override
    public Object getData() {
        return data;
    }
}
