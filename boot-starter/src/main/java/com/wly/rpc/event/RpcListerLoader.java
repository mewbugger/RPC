package com.wly.rpc.event;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author BarryCrude
 * @date 2025-01-17 0:45
 * @description: 事件监听器加载器（RpcListerLoader），用于管理和触发 RPC 事件监听器。
 */
public class RpcListerLoader {

    private static final ExecutorService eventThreadPool = Executors.newFixedThreadPool(2);


    private static final List<IRpcLister> rpcListerList = new ArrayList<>();

    public void init(){
        registerLister(new AddRpcLister());
        registerLister(new DestroyRpcLister());
        registerLister(new UpdateRpcLister());
    }
    public static void registerLister(IRpcLister rpcLister){
        rpcListerList.add(rpcLister);
    }

    public static void sendEvent(RpcEventData eventData){
        if (eventData == null){
            return;
        }
        if (!rpcListerList.isEmpty()){
            for (IRpcLister iRpcLister : rpcListerList) {
                final Class<?> generics = getInterfaceGenerics(iRpcLister);
                if (eventData.getClass().equals(generics)){
                    eventThreadPool.execute(()->{
                        iRpcLister.exec(eventData);
                    });
                }
            }
        }

    }

    public static Class<?> getInterfaceGenerics(Object o) {
        Type[] types = o.getClass().getGenericInterfaces();
        ParameterizedType parameterizedType = (ParameterizedType) types[0];
        Type type = parameterizedType.getActualTypeArguments()[0];
        if (type instanceof Class<?>) {
            return (Class<?>) type;
        }
        return null;
    }
}
