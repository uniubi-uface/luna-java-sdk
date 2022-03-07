package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.models.request.DeleteDeviceRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class DeleteDeviceRequest {

    private String deviceKey;

    public String getDeviceKey() {
        return deviceKey;
    }

    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
    }

    @Override
    public String toString() {
        return "DeleteDeviceRequest{" +
                "deviceKey='" + deviceKey + '\'' +
                '}';
    }
}
