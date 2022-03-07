package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.models.request.AddDeviceRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class AddDeviceRequest {

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 设备ip
     */
    private String deviceIp;

    /**
     * 设备密码
     */
    private String devicePass;

    /**
     * 设备分组
     */
    private String deviceGroupId;

    /**
     * 设备语言（en（英文） zh-CN（中文））
     */
    private String lang;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceIp() {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }

    public String getDevicePass() {
        return devicePass;
    }

    public void setDevicePass(String devicePass) {
        this.devicePass = devicePass;
    }

    public String getDeviceGroupId() {
        return deviceGroupId;
    }

    public void setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "AddDeviceRequest{" + "deviceName='" + deviceName + '\'' + ", deviceIp='" + deviceIp + '\''
                + ", devicePass='" + devicePass + '\'' + ", deviceGroupId='" + deviceGroupId + '\'' + ", lang='" + lang
                + '\'' + '}';
    }

}
