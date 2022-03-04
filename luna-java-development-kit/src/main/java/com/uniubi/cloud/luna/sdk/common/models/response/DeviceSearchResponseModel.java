package com.uniubi.cloud.luna.sdk.common.models.response;

import lombok.Data;

/**
 * com.uniubi.medusa.ares.develop.models.response.DeviceSearchResponseModel
 * @author jingmu
 * @since 2020/5/18
 */
@Data

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

}
