package com.uniubi.cloud.luna.sdk.common.models.request;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.request.UpdateDeviceGroupRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class UpdateDeviceGroupRequest {

    /**
     * 设备组id
     */
    private String deviceGroupId;

    /**
     * 设备组名称
     */
    private String deviceGroupName;

    /**
     * 设备序列号
     */
    private List<String> deviceKeyList;

    /**
     * 设备组备注
     */
    private String remark;

    public String getDeviceGroupId() {
        return deviceGroupId;
    }

    public void setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
    }

    public String getDeviceGroupName() {
        return deviceGroupName;
    }

    public void setDeviceGroupName(String deviceGroupName) {
        this.deviceGroupName = deviceGroupName;
    }

    public List<String> getDeviceKeyList() {
        return deviceKeyList;
    }

    public void setDeviceKeyList(List<String> deviceKeyList) {
        this.deviceKeyList = deviceKeyList;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "UpdateDeviceGroupRequest{" + "deviceGroupId='" + deviceGroupId + '\'' + ", deviceGroupName='"
                + deviceGroupName + '\'' + ", deviceKeyList=" + deviceKeyList + ", remark='" + remark + '\'' + '}';
    }

}
