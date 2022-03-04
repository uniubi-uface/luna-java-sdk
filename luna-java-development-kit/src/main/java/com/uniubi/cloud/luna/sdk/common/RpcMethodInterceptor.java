package com.uniubi.cloud.luna.sdk.common;

/**
 * 调用过滤器
 * @author jingmu
 * @since 2020/5/7
 */
public interface RpcMethodInterceptor {

    /**
     * 方法调用
     * @param rpcMethod rpc方法封装对象
     * @return 返回方法执行结果
     */
    Object process(RpcMethod rpcMethod);

}
