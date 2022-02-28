package com.uniubi.cloud.luna.sdk.http;

import com.uniubi.cloud.luna.sdk.http.defaults.DefaultRequestConverter;

/**
 * 请求转换器 UniUbiHttpClient 使用该类对请求体进行序列化操作
 *
 * @author jingmu
 * @since 2020/3/26
 * @see UniUbiHttpClient 宇泛httpClient，用于发送sdk请求到服务端的http实现
 * @see DefaultRequestConverter
 */
public interface RequestConverter {

    /**
     * 对象转换
     * @param requestBody 请求body
     * @return 返回转换的字符串
     */
    String converter(Object requestBody);

}
