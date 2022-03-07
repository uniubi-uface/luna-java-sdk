package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.models.request.UpdateDeviceNetConfigRequest
 *
 * @author jingmu
 * @since 2020/5/19
 */
public class UpdateDeviceNetConfigRequest extends DeviceOperatorBaseRequest {

    private Boolean DHCP;

    private String dNS;

    private String gateway;

    private String ip;

    public Boolean getDHCP() {
        return DHCP;
    }

    public void setDHCP(Boolean DHCP) {
        this.DHCP = DHCP;
    }

    public String getdNS() {
        return dNS;
    }

    public void setdNS(String dNS) {
        this.dNS = dNS;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "UpdateDeviceNetConfigRequest{" + "DHCP=" + DHCP + ", dNS='" + dNS + '\'' + ", gateway='" + gateway
                + '\'' + ", ip='" + ip + '\'' + '}';
    }

}
