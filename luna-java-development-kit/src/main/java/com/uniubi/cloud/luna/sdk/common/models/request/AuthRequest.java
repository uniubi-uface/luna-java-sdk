package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;

/**
 * 鉴权请求对象
 * @author jingmu
 * @since 2020/3/26
 */
@Data
public class AuthRequest {

    private String accessKey;

    private String accessSecret;

}
