package com.wly.rpc.event;

import com.wly.rpc.common.Cache;
import com.wly.rpc.common.Host;
import com.wly.rpc.common.ServiceName;
import com.wly.rpc.common.URL;
import io.netty.channel.ChannelFuture;

import java.util.ArrayList;

/**
 * @author BarryCrude
 * @date 2025-01-17 0:00
 * @description:  监听 AddRpcEventData 事件，动态地将新服务实例的 URL 信息缓存起来，并建立网络连接。
 */
public class AddRpcLister implements IRpcLister<AddRpcEventData>{
    @Override
    public void exec(AddRpcEventData addRpcEventData) {
        final URL url = (URL)addRpcEventData.getData();
        final ServiceName serviceName = new ServiceName(url.getServiceName(), url.getVersion());
        if (!Cache.SERVICE_URLS.containsKey(serviceName)) {
            Cache.SERVICE_URLS.put(serviceName, new ArrayList<>());
        }
        Cache.SERVICE_URLS.get(serviceName).add(url);
        final Host ip = new Host(url.getIp(), url.getPort());
        if (!Cache.CHANNEL_FUTURE_MAP.containsKey(ip)) {
            ChannelFuture channelFuture = Cache.BOOT_STRAP.connect(url.getIp(), url.getPort());
            Cache.CHANNEL_FUTURE_MAP.put(ip, channelFuture);
        }
    }
}
