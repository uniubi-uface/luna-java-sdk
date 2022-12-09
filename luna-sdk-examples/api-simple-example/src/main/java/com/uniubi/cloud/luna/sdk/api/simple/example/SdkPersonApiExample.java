package com.uniubi.cloud.luna.sdk.api.simple.example;

import com.alibaba.fastjson.JSON;
import com.uniubi.cloud.luna.sdk.clients.LunaSdkApiClient;
import com.uniubi.cloud.luna.sdk.clients.SdkPersonApi;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;
import com.uniubi.cloud.luna.sdk.common.models.request.AddPersonRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.GenerateEmpQrCodeRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.UpdatePersonRequest;
import com.uniubi.cloud.luna.sdk.common.models.response.AresEmpQrCodeModel;

/**
 * @author 井木
 * @since 2022/12/09
 */
public class SdkPersonApiExample extends SdkBaseContext {

    public static void main(String[] args) {
        SdkPersonApi sdkPersonApi = getSdkApi();
        // testAddPerson(sdkPersonApi);
        // testUpdatePerson(sdkPersonApi);
        testGenerateEmpQrCode(sdkPersonApi);
    }

    private static void testGenerateEmpQrCode(SdkPersonApi sdkPersonApi) {
        GenerateEmpQrCodeRequest request = new GenerateEmpQrCodeRequest();
        request.setEmpId("5b386b94ad7f42608a2ae708ed65926c");
        request.setEffectiveTimeType(5);
        SdkResult<AresEmpQrCodeModel> result = sdkPersonApi.generateEmpQrCode(request);
        System.out.println(result);
    }

    private static void testUpdatePerson(SdkPersonApi sdkPersonApi) {
        UpdatePersonRequest request = new UpdatePersonRequest();
        request.setEmpNo("1");
        request.setName("update2 Name2");
        request.setMail("jingmu@uni-ubi.com");
        request.setQrCodeId("9ed6306b264b4451ba98b639b05f20b0");
        SdkResult<Void> result = sdkPersonApi.updatePerson(request);
        System.out.println(JSON.toJSONString(result));
    }

    private static void testAddPerson(SdkPersonApi sdkPersonApi) {
        // 7. RPC call UStar API
        AddPersonRequest addPersonRequest = new AddPersonRequest();
        SdkResult<String> result = sdkPersonApi.addPerson(addPersonRequest);
        // 8. print the result
        System.out.println(result);
    }

    private static SdkPersonApi getSdkApi() {
        // 5. create the AthenaSdkApiClient
        LunaSdkApiClient athenaSdkApiClient = lunaSdkApiClient();
        // 6. get api instance
        return athenaSdkApiClient.createSdkPersonApi();
    }

}
