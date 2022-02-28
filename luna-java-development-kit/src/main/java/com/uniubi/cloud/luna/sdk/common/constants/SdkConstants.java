package com.uniubi.cloud.luna.sdk.common.constants;

import com.squareup.okhttp.MediaType;

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
    public static final String UNIUBI_SDK_UNIFY_URL;

    /**
     * sdk鉴权请求key
     */
    public static final String SDK_AUTH_REQUEST_KEY;

    /**
     * sdk统一请求key名称
     */
    public static final String HEADER_REQUEST_KEY_NAME;

    /**
     * 请求头部token名称
     */
    public static final String HEADER_TOKEN_NAME;

    /**
     * 请求头部语言名称
     */
    public static final String HEADER_LANG_NAME;

    /**
     * 加密口令
     */
    public static final String HEADER_SECRET_KEY_NAME;

    /**
     * 空请求体常量
     */
    public static final Map<String, String> EMPTY_PARAM;

    /**
     * 鉴权成功结果code用来判断鉴权操作是否成功
     */
    public static final String AUTH_SUCCESS_CODE;

    /**
     * token校验失败返回码
     */
    public static final String TOKEN_FAILED_CODE = "ARES-SDK-008";

    /**
     * 鉴权时用到的平台短语前缀
     */
    public static final String SDK_PLATFORM_SHORT_NAME_PREFIX;

    /**
     * sdk统一contentType
     */
    public static final MediaType SDK_UNIFY_CONTENT_TYPE;

    /**
     * http协议前缀
     */
    public static final String HTTP_PROTO_PREFIX;

    /**
     * 统一请求参数名称
     */
    public static final String REQUEST_DATA_KEY;

    /**
     * http请求成功code
     */
    public static final int HTTP_OK_CODE;

    static {
        SDK_AUTH_REQUEST_KEY = "authToken";
        UNIUBI_SDK_UNIFY_URL = "/develop/sdk/v1";
        HEADER_REQUEST_KEY_NAME = "sdkRequestKey";
        HEADER_SECRET_KEY_NAME = "sdkSecretKey";
        HEADER_TOKEN_NAME = "sdkAccessToken";
        HEADER_LANG_NAME = "lang";
        AUTH_SUCCESS_CODE = "DEP_SUS-1000";
        SDK_PLATFORM_SHORT_NAME_PREFIX = "uniubi_sdk:";
        SDK_UNIFY_CONTENT_TYPE = MediaType.parse("application/json");
        HTTP_PROTO_PREFIX = "http://";
        REQUEST_DATA_KEY = "requestData";
        EMPTY_PARAM = new HashMap<>(1);
        EMPTY_PARAM.put(REQUEST_DATA_KEY, "{}");
        HTTP_OK_CODE = 200;
    }

}
