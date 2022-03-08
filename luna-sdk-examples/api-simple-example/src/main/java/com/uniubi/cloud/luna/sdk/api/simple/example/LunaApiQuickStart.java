package com.uniubi.cloud.luna.sdk.api.simple.example;

import com.uniubi.cloud.luna.sdk.clients.LunaSdkApiClient;
import com.uniubi.cloud.luna.sdk.clients.SdkTestApi;
import com.uniubi.cloud.luna.sdk.common.RequestConfig;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;

/**
 * @author jingmu
 * @since 2022/02/24
 */
public class LunaApiQuickStart {

    static final String PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCoZHF/b8WBUkVMQ9IOvva2W0IBT/OkZgjsnbHwCPiirLTMcE61LGkGrGBeGzr9Ro77qfsDBESOHxDaL1NFa52863tjsAxMkiOB6pGLuN5NUuWZAGmLZ77JzDRKzr0AC3zOPl/eTRJpxnokZY5d4XQDQENjG2y+jDlS/halfWjsZwIDAQAB";

    static final String ACCESS_KEY = "f02346aa61d94bda9b1370d2eec2234a";

    static final String ACCESS_SECRET = "e6df6b3b540a4ba194071f89717b801b";

    public static void main(String[] args) {
        // 1. new RequestConfig
        RequestConfig requestConfig = new RequestConfig();
        // 2. set connection time out
        requestConfig.setConnectionTimeoutMills(3000L);
        requestConfig.setReadTimeoutMills(3000L);
        // 3. set your public key
        requestConfig.setPublicKey(PUBLIC_KEY);
        // 4. set service end point if necessary
        requestConfig.setEndPoint("http://localhost:9091");
        // 5. create the AthenaSdkApiClient
        LunaSdkApiClient athenaSdkApiClient = new LunaSdkApiClient(ACCESS_KEY, ACCESS_SECRET, requestConfig);
        // 6. get api instance
        SdkTestApi sdkTestApi = athenaSdkApiClient.createSdkTestApi();
        // 7. RPC call UStar API
        SdkResult<String> result = sdkTestApi.test();
        // 8. print the result
        System.out.println(result);
    }

}