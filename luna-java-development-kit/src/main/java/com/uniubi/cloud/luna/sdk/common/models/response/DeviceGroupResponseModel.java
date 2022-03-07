package com.uniubi.cloud.luna.sdk.common.models.response;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.response.DeviceGroupResponseModel
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class DeviceGroupResponseModel {

    /**
     * 设备分组id
     */
    private String deviceGroupId;

    /**
     * 设备分组名称
     */
    private String deviceGroupName;

    /**
     * 设备数
     */
    private Integer deviceNum;

    /**
     * 设备分组数量
     */
    private String remark;

    /**
     * device Key List
     */
    private List<String> deviceKeyList;

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

    public Integer getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(Integer deviceNum) {
        this.deviceNum = deviceNum;
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
        return "DeviceGroupResponseModel{" +
                "deviceGroupId='" + deviceGroupId + '\'' +
                ", deviceGroupName='" + deviceGroupName + '\'' +
                ", deviceNum=" + deviceNum +
                ", remark='" + remark + '\'' +
                ", deviceKeyList=" + deviceKeyList +
                '}';
    }
}
