package com.uniubi.cloud.luna.sdk.http;

import lombok.Data;

/**
 * 请求配置
 * @author jingmu
 * @since 2020/3/31
 */
@Data
public class ClientConfig {

    private Long connectionTimeoutMills;

    private Long readTimeoutMills;

    private Long writeTimeoutMills;

}
