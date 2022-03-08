package com.uniubi.cloud.luna.sdk.common.constants;

import okhttp3.MediaType;

import java.util.HashMap;
import java.util.Map;

/**
 * sdk常量
 *
 * @author jingmu
 * @since 2020/3/26
 */
public class SdkConstants {

    /**
     * 宇泛sdk统一请求地址
     */
    public static final String UNIUBI_SDK_UNIFY_URL = "/develop/sdk/v1";

    /**
     * sdk鉴权请求key
     */
    public static final String SDK_AUTH_REQUEST_KEY = "authToken";

    /**
     * sdk统一请求key名称
     */
    public static final String HEADER_REQUEST_KEY_NAME = "sdkRequestKey";

    /**
     * 请求头部token名称
     */
    public static final String HEADER_TOKEN_NAME = "sdkAccessToken";

    /**
     * 请求头部语言名称
     */
    public static final String HEADER_LANG_NAME = "lang";

    /**
     * 加密口令
     */
    public static final String HEADER_SECRET_KEY_NAME = "sdkSecretKey";

    /**
     * 空请求体常量
     */
    public static final Map<String, String> EMPTY_PARAM = new HashMap<>(8);

    /**
     * 鉴权成功结果code用来判断鉴权操作是否成功
     */
    public static final String AUTH_SUCCESS_CODE = "DEP_SUS-1000";

    /**
     * token校验失败返回码
     */
    public static final String TOKEN_FAILED_CODE = "ARES-SDK-008";

    /**
     * sdk统一contentType
     */
    public static final MediaType SDK_UNIFY_CONTENT_TYPE = MediaType.parse("application/json");

    /**
     * http协议前缀
     */
    public static final String HTTP_PROTO_PREFIX = "http://";

    /**
     * https协议前缀
     */
    public static final String HTTPS_PROTO_PREFIX = "https://";

    /**
     * 统一请求参数名称
     */
    public static final String REQUEST_DATA_KEY = "requestData";

    /**
     * http请求成功code
     */
    public static final int HTTP_OK_CODE = 200;

    static {
        EMPTY_PARAM.put(REQUEST_DATA_KEY, "{}");
    }

}
