package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.models.request.GetDeviceRequest
 * @author jingmu
 * @since 2020/5/18
 */
public class GetDeviceRequest {

    private String deviceKey;

    public String getDeviceKey() {
        return deviceKey;
    }

    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
    }

    @Override
    public String toString() {
        return "GetDeviceRequest{" + "deviceKey='" + deviceKey + '\'' + '}';
    }

}
