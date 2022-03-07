package com.uniubi.cloud.luna.sdk.common.models.request;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.request.DeviceOperatorBaseRequest
 *
 * @author jingmu
 * @since 2020/5/19
 */
public class DeviceOperatorBaseRequest {

    /**
     * 批量操作的设备序列号
     */
    private List<String> deviceKeyList;

    public List<String> getDeviceKeyList() {
        return deviceKeyList;
    }

    public void setDeviceKeyList(List<String> deviceKeyList) {
        this.deviceKeyList = deviceKeyList;
    }

    @Override
    public String toString() {
        return "DeviceOperatorBaseRequest{" + "deviceKeyList=" + deviceKeyList + '}';
    }

}
