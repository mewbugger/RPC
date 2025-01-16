package com.wly.rpc.event;

import com.wly.rpc.common.Cache;
import com.wly.rpc.common.Host;
import com.wly.rpc.common.ServiceName;
import com.wly.rpc.common.URL;

/**
 * @author BarryCrude
 * @date 2025-01-17 0:26
 * @description: 监听 DestroyEventData 事件，动态地将服务实例的 URL 信息删除，并删除网络连接。
 */
public class DestroyRpcLister implements IRpcLister<DestroyEventData>{
    @Override
    public void exec(DestroyEventData destroyEventData) {
        final URL url = (URL) destroyEventData.getData();
        final ServiceName serviceName = new ServiceName(url.getServiceName(), url.getVersion());
        if (Cache.SERVICE_URLS.containsKey(serviceName)) {
            Cache.SERVICE_URLS.get(serviceName).remove(url);
        }
        final Host ip = new Host(url.getIp(), url.getPort());
        if (Cache.CHANNEL_FUTURE_MAP.containsKey(ip)) {
            Cache.CHANNEL_FUTURE_MAP.remove(ip);
        }
    }
}
