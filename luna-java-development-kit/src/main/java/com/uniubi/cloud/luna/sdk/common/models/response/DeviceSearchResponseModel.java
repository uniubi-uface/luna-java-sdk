package com.uniubi.cloud.luna.sdk.common.models.response;

/**
 * com.uniubi.medusa.ares.develop.models.response.DeviceSearchResponseModel
 * @author jingmu
 * @since 2020/5/18
 */
public class DeviceSearchResponseModel {

    private String deviceKey;

    private String deviceName;

    private String deviceGroupName;

    private String softwareVersion;

    private String ip;

    /**
     * Has it been added to ustar
     */
    private Boolean alreadyExist;

    private Boolean hasPassword;

    private Boolean dhcp;

    private Boolean legal;

    /**
     * 设备类型
     */
    private Integer deviceType;

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

    public String getDeviceGroupName() {
        return deviceGroupName;
    }

    public void setDeviceGroupName(String deviceGroupName) {
        this.deviceGroupName = deviceGroupName;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Boolean getAlreadyExist() {
        return alreadyExist;
    }

    public void setAlreadyExist(Boolean alreadyExist) {
        this.alreadyExist = alreadyExist;
    }

    public Boolean getHasPassword() {
        return hasPassword;
    }

    public void setHasPassword(Boolean hasPassword) {
        this.hasPassword = hasPassword;
    }

    public Boolean getDhcp() {
        return dhcp;
    }

    public void setDhcp(Boolean dhcp) {
        this.dhcp = dhcp;
    }

    public Boolean getLegal() {
        return legal;
    }

    public void setLegal(Boolean legal) {
        this.legal = legal;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    @Override
    public String toString() {
        return "DeviceSearchResponseModel{" + "deviceKey='" + deviceKey + '\'' + ", deviceName='" + deviceName + '\''
            + ", deviceGroupName='" + deviceGroupName + '\'' + ", softwareVersion='" + softwareVersion + '\''
            + ", ip='" + ip + '\'' + ", alreadyExist=" + alreadyExist + ", hasPassword=" + hasPassword + ", dhcp="
            + dhcp + ", legal=" + legal + ", deviceType=" + deviceType + '}';
    }

}
