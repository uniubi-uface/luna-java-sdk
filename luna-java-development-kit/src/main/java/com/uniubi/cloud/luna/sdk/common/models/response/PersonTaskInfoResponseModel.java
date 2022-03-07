package com.uniubi.cloud.luna.sdk.common.models.response;

/**
 * com.uniubi.medusa.ares.develop.models.response.PersonTaskInfoResponseModel
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class PersonTaskInfoResponseModel {

    private String empNo;

    private String empName;

    private String faceId;

    private String deviceName;

    private String deviceKey;

    private Boolean success;

    private String failedReason;

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceKey() {
        return deviceKey;
    }

    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    @Override
    public String toString() {
        return "PersonTaskInfoResponseModel{" + "empNo='" + empNo + '\'' + ", empName='" + empName + '\'' + ", faceId='"
                + faceId + '\'' + ", deviceName='" + deviceName + '\'' + ", deviceKey='" + deviceKey + '\''
                + ", success=" + success + ", failedReason='" + failedReason + '\'' + '}';
    }

}
