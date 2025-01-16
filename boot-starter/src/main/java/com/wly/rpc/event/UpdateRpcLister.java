package com.wly.rpc.event;

import com.wly.rpc.common.Cache;
import com.wly.rpc.common.ServiceName;
import com.wly.rpc.common.URL;

/**
 * @author BarryCrude
 * @date 2025-01-17 0:39
 * @description: url修改事件数据类，用于封装事件触发时传递的数据（url）
 */
public class UpdateRpcLister implements IRpcLister<UpdateRpcEventData>{
    @Override
    public void exec(UpdateRpcEventData updateRpcEventData) {
        // todo 补全exec
        System.out.println("触发修改件" + updateRpcEventData);
    }
}
