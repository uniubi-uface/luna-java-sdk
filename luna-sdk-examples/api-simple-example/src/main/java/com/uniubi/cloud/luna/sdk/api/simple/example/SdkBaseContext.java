package com.uniubi.cloud.luna.sdk.api.simple.example;

import com.uniubi.cloud.luna.sdk.clients.LunaSdkApiClient;
import com.uniubi.cloud.luna.sdk.common.RequestConfig;

/**
 * @author 井木
 * @since 2022/12/09
 */
public class SdkBaseContext {

    static final String PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCW3xGbdanLWooS/0XqnetXzs3VkIloLAWRR0caqhtYPGSP+vyLqrl7bDYuxJob7DGEDJa7T2SUtW2ph63uPcY4ZI9SYg6sMcTXIs8icWFWZMB+Xyc3sPbVdzt2/IukFmBom8kDdfKWCSzSHaVzcZx9kRIptARkIjr73Uxgu44XHQIDAQAB";

    static final String ACCESS_KEY = "4c76839bdfd0459989b3dfcb07a1f756";

    static final String ACCESS_SECRET = "cc6bd32f8bad4e748bbc2b8a9cadc2e7";

    protected static RequestConfig getRequestConfig() {
        // 1. new RequestConfig
        RequestConfig requestConfig = new RequestConfig();
        // 2. set connection time out
        requestConfig.setConnectionTimeoutMills(3000L);
        requestConfig.setReadTimeoutMills(3000L);
        // 3. set your public key
        requestConfig.setPublicKey(PUBLIC_KEY);
        // 4. set service end point if necessary
        requestConfig.setEndPoint("http://localhost:9092");
        return requestConfig;
    }

    protected static LunaSdkApiClient lunaSdkApiClient() {
        // 5. create the AthenaSdkApiClient
        return new LunaSdkApiClient(ACCESS_KEY, ACCESS_SECRET, getRequestConfig());
    }
}
