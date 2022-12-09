package com.uniubi.cloud.luna.sdk.api.simple.example;

import com.uniubi.cloud.luna.sdk.clients.LunaSdkApiClient;
import com.uniubi.cloud.luna.sdk.clients.SdkTestApi;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;

/**
 * @author jingmu
 * @since 2022/02/24
 */
public class LunaApiQuickStart extends SdkBaseContext {

    public static void main(String[] args) {
        SdkTestApi sdkTestApi = getSdkApi();
        // 7. RPC call UStar API
        SdkResult<String> result = sdkTestApi.test();
        // 8. print the result
        System.out.println(result);
    }

    private static SdkTestApi getSdkApi() {
        LunaSdkApiClient athenaSdkApiClient = lunaSdkApiClient();
        // 6. get api instance
        return athenaSdkApiClient.createSdkTestApi();
    }

}