package com.wly.rpc.invoke;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author BarryCrude
 * @date 2025-01-26 0:22
 * @description: 封装一次 RPC 调用的所有必要信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Invocation {
    private String serviceVersion;
    private String className;
    private String methodName;
    private Integer methodCode;
    private Object parameter;
    private Class<?> parameterTypes;
}
