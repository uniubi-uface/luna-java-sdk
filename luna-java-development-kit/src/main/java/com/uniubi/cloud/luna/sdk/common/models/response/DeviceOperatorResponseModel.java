package com.uniubi.cloud.luna.sdk.common.models.response;

/**
 * com.uniubi.medusa.ares.develop.models.response.DeviceOperatorResponseModel
 *
 * @author jingmu
 * @since 2020/5/19
 */
public class DeviceOperatorResponseModel {

    /**
     * 设备序列号
     */
    private String deviceKey;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 是否操作成功
     */
    private Boolean success;

    /**
     * 如果失败了，失败的原因是什么
     */
    private String reason;

    public String getDeviceKey() {
        return deviceKey;
    }

    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "DeviceOperatorResponseModel{" + "deviceKey='" + deviceKey + '\'' + ", deviceName='" + deviceName + '\''
                + ", success=" + success + ", reason='" + reason + '\'' + '}';
    }

}
