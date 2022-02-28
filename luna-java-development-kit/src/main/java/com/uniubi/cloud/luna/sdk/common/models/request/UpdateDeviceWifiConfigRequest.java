package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;

/**
 * com.uniubi.medusa.ares.develop.models.request.UpdateDeviceWifiConfigRequest
 *
 * @author jingmu
 * @since 2020/5/19
 */
@Data
public class UpdateDeviceWifiConfigRequest extends DeviceOperatorBaseRequest {

    private String wifiName;

    private String wifiPass;

    private Boolean dhcp;

    private String ip;

    private String gateway;

    private String dns;

    private String subnetMask;

}
