package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.RequestConfig;
import com.uniubi.cloud.luna.sdk.common.UniUbiSdkClientProxyFactory;

/**
 * com.uniubi.medusa.ares.develop.api.clients.LunaSdkApiClient
 *
 * @author jingmu
 * @since 2020/5/7
 */
public class LunaSdkApiClient {

    private final UniUbiSdkClientProxyFactory uniUbiSdkClientProxyFactory;

    public LunaSdkApiClient(String accessKey, String accessSecret) {
        this(accessKey, accessSecret, new RequestConfig());
    }

    public LunaSdkApiClient(String accessKey, String accessSecret, RequestConfig requestConfig) {
        uniUbiSdkClientProxyFactory = new UniUbiSdkClientProxyFactory(accessKey, accessSecret, requestConfig);
    }

    /**
     * 测试用
     * @return 返回测试客户端接口
     */
    public SdkTestApi createSdkTestApi() {
        return uniUbiSdkClientProxyFactory.createProxy(SdkTestApi.class);
    }

    public SdkPersonApi createSdkPersonApi() {
        return uniUbiSdkClientProxyFactory.createProxy(SdkPersonApi.class);
    }

    public SdkPersonRoleApi createSdkPersonRoleApi() {
        return uniUbiSdkClientProxyFactory.createProxy(SdkPersonRoleApi.class);
    }

    public SdkPersonTypeApi createSdkPersonTypeApi() {
        return uniUbiSdkClientProxyFactory.createProxy(SdkPersonTypeApi.class);
    }

    public SdkRecognitionApi createSdkRecognitionApi() {
        return uniUbiSdkClientProxyFactory.createProxy(SdkRecognitionApi.class);
    }

    public SdkPersonGroupApi createSdkPersonGroupApi() {
        return uniUbiSdkClientProxyFactory.createProxy(SdkPersonGroupApi.class);
    }

    public SdkFileApi createSdkFileApi() {
        return uniUbiSdkClientProxyFactory.createProxy(SdkFileApi.class);
    }

    public SdkDeviceSearchApi createSdkDeviceSearchApi() {
        return uniUbiSdkClientProxyFactory.createProxy(SdkDeviceSearchApi.class);
    }

    public SdkDeviceGroupApi createSdkDeviceGroupApi() {
        return uniUbiSdkClientProxyFactory.createProxy(SdkDeviceGroupApi.class);
    }

    public SdkDeviceAuthApi createSdkDeviceAuthApi() {
        return uniUbiSdkClientProxyFactory.createProxy(SdkDeviceAuthApi.class);
    }

    public SdkDeviceApi createSdkDeviceApi() {
        return uniUbiSdkClientProxyFactory.createProxy(SdkDeviceApi.class);
    }

    public SdkDeviceCommandApi createSdkDeviceCommandApi() {
        return uniUbiSdkClientProxyFactory.createProxy(SdkDeviceCommandApi.class);
    }

    public SdkPersonFaceApi createSdkPersonFaceApi() {
        return uniUbiSdkClientProxyFactory.createProxy(SdkPersonFaceApi.class);
    }

    public SdkAtdReportApi createSdkAtdReportApi() {
        return uniUbiSdkClientProxyFactory.createProxy(SdkAtdReportApi.class);
    }

}
