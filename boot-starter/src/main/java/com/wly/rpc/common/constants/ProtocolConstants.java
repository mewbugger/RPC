package com.wly.rpc.common.constants;

/**
 * @author BarryCrude
 * @date 2025-01-08 0:57
 * @description: 协议常量类
 */
public class ProtocolConstants {

    /**
     * 协议头的总长度 解析数据包的时候，可以根据这个值来确定协议头的结束为止。
     */
    public static final int HEADER_TOTAL_LEN = 18;
    /**
     * 协议的魔数 解析数据包的时候，可以通过魔数验证数据包的合法性。
     */
    public static final short MAGIC = 0x10;
    /**
     * 协议的版本号 协议升级时，可以通过版本号进行兼容性处理。
     */
    public static final byte VERSION = 0x1;
}
