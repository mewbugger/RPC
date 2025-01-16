package com.wly.rpc.event;

/**
 * @author BarryCrude
 * @date 2025-01-17 0:38
 * @description:
*/
// todo 待完善
public class UpdateRpcEventData implements RpcEventData{
    private Object data;

    public UpdateRpcEventData(Object data) {
        this.data = data;
    }

    @Override
    public void setData(Object o) {
        this.data = o;
    }

    @Override
    public Object getData() {
        return data;
    }
}
