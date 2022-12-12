package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.models.request.DeleteDeviceGroupRequest
 * @author jingmu
 * @since 2020/5/18
 */
public class DeleteDeviceGroupRequest {

    private String deviceGroupId;

    public String getDeviceGroupId() {
        return deviceGroupId;
    }

    public void setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
    }

    @Override
    public String toString() {
        return "DeleteDeviceGroupRequest{" + "deviceGroupId='" + deviceGroupId + '\'' + '}';
    }

}
