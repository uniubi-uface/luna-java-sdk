package com.uniubi.cloud.luna.sdk.common.models.request;

import java.time.LocalDateTime;
import java.util.List;

/**
 * UpdateDeviceAuthRequest
 * @author 阿秋@niancheng
 * @since 2020/6/19
 */
public class UpdateDeviceAuthRequest {

    /**
     * 员工编号
     */
    private String empNo;

    /**
     * 设备序列号
     */
    private String deviceKey;

    /**
     * 权限有效期开始时间
     */
    private LocalDateTime permissionStartTime;

    /**
     * 权限有效期结束时间
     */
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
        return "UpdateDeviceAuthRequest{" + "empNo='" + empNo + '\'' + ", deviceKey='" + deviceKey + '\''
            + ", permissionStartTime=" + permissionStartTime + ", permissionEndTime=" + permissionEndTime
            + ", permissionTimeEntries=" + permissionTimeEntries + ", recognitionTypes=" + recognitionTypes + '}';
    }

}
