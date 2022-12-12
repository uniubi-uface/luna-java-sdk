package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * DeleteDeviceAuthRequest
 * @author 阿秋@niancheng description default
 * @since 2020/6/19
 */
public class DeleteDeviceAuthRequest {

    /**
     * 员工编号
     */
    private String empNo;

    /**
     * 设备序列号
     */
    private String deviceKey;

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

    @Override
    public String toString() {
        return "DeleteDeviceAuthRequest{" + "empNo='" + empNo + '\'' + ", deviceKey='" + deviceKey + '\'' + '}';
    }

}
