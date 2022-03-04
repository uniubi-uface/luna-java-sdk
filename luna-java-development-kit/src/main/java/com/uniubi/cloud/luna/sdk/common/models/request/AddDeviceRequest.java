package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;

/**
 * com.uniubi.medusa.ares.develop.models.request.AddDeviceRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
@Data
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

}
