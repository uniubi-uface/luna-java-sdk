package com.uniubi.cloud.luna.sdk.common.auth;

import com.uniubi.cloud.luna.sdk.common.SdkLang;
import com.uniubi.cloud.luna.sdk.common.TokenLoader;
import com.uniubi.cloud.luna.sdk.common.constants.SdkConstants;
import com.uniubi.cloud.luna.sdk.common.exceptions.UniUbiLunaSdkException;
import com.uniubi.cloud.luna.sdk.common.models.request.AuthRequest;
import com.uniubi.cloud.luna.sdk.common.models.response.AuthResponseModel;
import com.uniubi.cloud.luna.sdk.http.UniUbiHttpClient;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * 抽象tokenLoader实现
 *
 * @author jingmu
 * @since 2020/4/2
 */
public abstract class AbstractTokenLoader implements TokenLoader {

    private UniUbiHttpClient uniUbiHttpClient;

    private String accessKey;

    private String accessSecret;

    private String requestUrl;

    private SdkLang sdkLang;

    public AbstractTokenLoader(UniUbiHttpClient uniUbiHttpClient, String accessKey, String accessSecret,
            String requestUrl, SdkLang sdkLang) {
        this.uniUbiHttpClient = uniUbiHttpClient;
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
        this.requestUrl = requestUrl;
        this.sdkLang = sdkLang;
    }

    /**
     * 从服务器中获取token
     * @return 返回sdkToken
     */
    protected String requestForToken() {
        AuthRequest authRequest = getAuthRequest();
        // 鉴权获取token
        AuthResponseModel authResponseModel;
        try {
            // 鉴权请求不经过加密处理
            authResponseModel = uniUbiHttpClient.sendPostRequest(requestUrl, authRequest, getAuthHeader(),
                    AuthResponseModel.class);
        }
        catch (Exception e) {
            throw new UniUbiLunaSdkException(e);
        }
        if (authResponseModel.isSuccess()) {
            return authResponseModel.getData();
        }
        else {
            throw new UniUbiLunaSdkException(MessageFormat.format("load accessToken failed with : {0}({1})",
                    authResponseModel.getMsg(), authResponseModel.getCode()));
        }
    }

    protected Map<String, String> getAuthHeader() {
        Map<String, String> header = new HashMap<>(2);
        header.put(SdkConstants.HEADER_REQUEST_KEY_NAME, SdkConstants.SDK_AUTH_REQUEST_KEY);
        header.put(SdkConstants.HEADER_LANG_NAME, sdkLang.getValue());
        return header;
    }

    private AuthRequest getAuthRequest() {
        AuthRequest authRequest = new AuthRequest();
        authRequest.setAccessKey(accessKey);
        authRequest.setAccessSecret(accessSecret);
        return authRequest;
    }

}
