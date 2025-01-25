package com.wly.rpc.invoke;

import com.wly.rpc.common.constants.RpcInvoker;
import com.wly.rpc.spi.ExtensionLoader;

import java.io.IOException;

/**
 * @author BarryCrude
 * @date 2025-01-26 0:26
 * @description:
 */
public class InvokerFactory {

    public static Invoker get(RpcInvoker rpcInvoker) {
        return ExtensionLoader.getInstance().get(rpcInvoker.name);
    }

    public static Invoker get(String name) {
        return ExtensionLoader.getInstance().get(name);
    }

    public static void init() throws IOException, ClassNotFoundException {
        ExtensionLoader.getInstance().loadExtension(Invoker.class);
    }

}
