package com.wly.rpc.event;


/**
 * @author BarryCrude
 * @date 2025-01-17 0:00
 * @description: url添加事件数据类，用于封装事件触发时传递的数据（url）
 */
public class AddRpcEventData implements RpcEventData{

    private Object data;

    public AddRpcEventData(Object data) {
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
