package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * com.uniubi.medusa.ares.develop.models.request.UpdateDeviceNetConfigRequest
 * @author jingmu
 * @since 2020/5/19
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UpdateDeviceNetConfigRequest extends DeviceOperatorBaseRequest {

    private Boolean DHCP;

    private String dNS;

    private String gateway;

    private String ip;

}
