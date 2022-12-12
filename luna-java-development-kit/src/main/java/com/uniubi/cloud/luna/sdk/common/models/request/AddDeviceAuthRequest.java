package com.uniubi.cloud.luna.sdk.common.models.request;

import com.alibaba.fastjson.annotation.JSONField;

import java.time.LocalDateTime;
import java.util.List;

/**
 * AddDeviceAuthRequest
 * @author 阿秋@niancheng
 * @since 2020/6/19
 */
public class AddDeviceAuthRequest {

    /**
     * Employee No
     */
    private String empNo;

    /**
     * Device SN
     */
    private String deviceKey;

    /**
     * Whether to store the original drawing. If yes, the original drawing will be sent to
     * the device. If not, the sectional drawing will be sent to the device
     */
    private Boolean imgStoreDevice;

    /**
     * 权限有效期开始时间
     * <p>
     * Start time of the Permission validity period
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime permissionStartTime;

    /**
     * 权限有效期结束时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime permissionEndTime;

    /**
     * 权限时间段（最多六段）
     */
    private List<DeviceAuthPermissionTimeEntry> permissionTimeEntries;

    /**
     * 识别类型 1.人像识别 2.刷卡识别 3.人卡合一 4.人证对比
     */
    private List<Byte> recognitionTypes;

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getDeviceKey() {
        return deviceKey;
    }

    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
    }

    public Boolean getImgStoreDevice() {
        return imgStoreDevice;
    }

    public void setImgStoreDevice(Boolean imgStoreDevice) {
        this.imgStoreDevice = imgStoreDevice;
    }

    public LocalDateTime getPermissionStartTime() {
        return permissionStartTime;
    }

    public void setPermissionStartTime(LocalDateTime permissionStartTime) {
        this.permissionStartTime = permissionStartTime;
    }

    public LocalDateTime getPermissionEndTime() {
        return permissionEndTime;
    }

    public void setPermissionEndTime(LocalDateTime permissionEndTime) {
        this.permissionEndTime = permissionEndTime;
    }

    public List<DeviceAuthPermissionTimeEntry> getPermissionTimeEntries() {
        return permissionTimeEntries;
    }

    public void setPermissionTimeEntries(List<DeviceAuthPermissionTimeEntry> permissionTimeEntries) {
        this.permissionTimeEntries = permissionTimeEntries;
    }

    public List<Byte> getRecognitionTypes() {
        return recognitionTypes;
    }

    public void setRecognitionTypes(List<Byte> recognitionTypes) {
        this.recognitionTypes = recognitionTypes;
    }

    @Override
    public String toString() {
        return "AddDeviceAuthRequest{" + "empNo='" + empNo + '\'' + ", deviceKey='" + deviceKey + '\''
            + ", imgStoreDevice=" + imgStoreDevice + ", permissionStartTime=" + permissionStartTime
            + ", permissionEndTime=" + permissionEndTime + ", permissionTimeEntries=" + permissionTimeEntries
            + ", recognitionTypes=" + recognitionTypes + '}';
    }

}
