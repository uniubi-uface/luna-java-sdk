package com.uniubi.cloud.luna.sdk.common.models.request;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.request.AddDeviceGroupRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class AddDeviceGroupRequest {

    /**
     * 设备组名称
     */
    private String deviceGroupName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 设备序列号
     */
    private List<String> deviceKeyList;

    public String getDeviceGroupName() {
        return deviceGroupName;
    }

    public void setDeviceGroupName(String deviceGroupName) {
        this.deviceGroupName = deviceGroupName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<String> getDeviceKeyList() {
        return deviceKeyList;
    }

    public void setDeviceKeyList(List<String> deviceKeyList) {
        this.deviceKeyList = deviceKeyList;
    }

    @Override
    public String toString() {
        return "AddDeviceGroupRequest{" + "deviceGroupName='" + deviceGroupName + '\'' + ", remark='" + remark + '\''
                + ", deviceKeyList=" + deviceKeyList + '}';
    }

}
