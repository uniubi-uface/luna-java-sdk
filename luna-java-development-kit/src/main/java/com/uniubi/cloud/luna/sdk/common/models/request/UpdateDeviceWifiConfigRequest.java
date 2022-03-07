package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.models.request.UpdateDeviceWifiConfigRequest
 *
 * @author jingmu
 * @since 2020/5/19
 */
public class UpdateDeviceWifiConfigRequest extends DeviceOperatorBaseRequest {

    private String wifiName;

    private String wifiPass;

    private Boolean dhcp;

    private String ip;

    private String gateway;

    private String dns;

    private String subnetMask;


    public String getWifiName() {
        return wifiName;
    }

    public void setWifiName(String wifiName) {
        this.wifiName = wifiName;
    }

    public String getWifiPass() {
        return wifiPass;
    }

    public void setWifiPass(String wifiPass) {
        this.wifiPass = wifiPass;
    }

    public Boolean getDhcp() {
        return dhcp;
    }

    public void setDhcp(Boolean dhcp) {
        this.dhcp = dhcp;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getDns() {
        return dns;
    }

    public void setDns(String dns) {
        this.dns = dns;
    }

    public String getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
    }

    @Override
    public String toString() {
        return "UpdateDeviceWifiConfigRequest{" +
                "wifiName='" + wifiName + '\'' +
                ", wifiPass='" + wifiPass + '\'' +
                ", dhcp=" + dhcp +
                ", ip='" + ip + '\'' +
                ", gateway='" + gateway + '\'' +
                ", dns='" + dns + '\'' +
                ", subnetMask='" + subnetMask + '\'' +
                '}';
    }
}
