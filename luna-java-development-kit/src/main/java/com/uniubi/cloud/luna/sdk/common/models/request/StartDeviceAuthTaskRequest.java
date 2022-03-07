package com.uniubi.cloud.luna.sdk.common.models.request;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.request.StartDeviceAuthTaskRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class StartDeviceAuthTaskRequest {

    private List<String> empNoList;

    private List<String> depIdList;

    private List<String> deviceKeyList;

    private Boolean enablePassTime;

    private DeviceAuthPermissionTime permissionTime;

    private Boolean imgStoreDevice;

    private Boolean stopAuthWhenNotCompatibility;

    private List<Byte> recognitionTypes;

    private String orgId;

    public List<String> getEmpNoList() {
        return empNoList;
    }

    public void setEmpNoList(List<String> empNoList) {
        this.empNoList = empNoList;
    }

    public List<String> getDepIdList() {
        return depIdList;
    }

    public void setDepIdList(List<String> depIdList) {
        this.depIdList = depIdList;
    }

    public List<String> getDeviceKeyList() {
        return deviceKeyList;
    }

    public void setDeviceKeyList(List<String> deviceKeyList) {
        this.deviceKeyList = deviceKeyList;
    }

    public Boolean getEnablePassTime() {
        return enablePassTime;
    }

    public void setEnablePassTime(Boolean enablePassTime) {
        this.enablePassTime = enablePassTime;
    }

    public DeviceAuthPermissionTime getPermissionTime() {
        return permissionTime;
    }

    public void setPermissionTime(DeviceAuthPermissionTime permissionTime) {
        this.permissionTime = permissionTime;
    }

    public Boolean getImgStoreDevice() {
        return imgStoreDevice;
    }

    public void setImgStoreDevice(Boolean imgStoreDevice) {
        this.imgStoreDevice = imgStoreDevice;
    }

    public Boolean getStopAuthWhenNotCompatibility() {
        return stopAuthWhenNotCompatibility;
    }

    public void setStopAuthWhenNotCompatibility(Boolean stopAuthWhenNotCompatibility) {
        this.stopAuthWhenNotCompatibility = stopAuthWhenNotCompatibility;
    }

    public List<Byte> getRecognitionTypes() {
        return recognitionTypes;
    }

    public void setRecognitionTypes(List<Byte> recognitionTypes) {
        this.recognitionTypes = recognitionTypes;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Override
    public String toString() {
        return "StartDeviceAuthTaskRequest{" +
                "empNoList=" + empNoList +
                ", depIdList=" + depIdList +
                ", deviceKeyList=" + deviceKeyList +
                ", enablePassTime=" + enablePassTime +
                ", permissionTime=" + permissionTime +
                ", imgStoreDevice=" + imgStoreDevice +
                ", stopAuthWhenNotCompatibility=" + stopAuthWhenNotCompatibility +
                ", recognitionTypes=" + recognitionTypes +
                ", orgId='" + orgId + '\'' +
                '}';
    }
}
