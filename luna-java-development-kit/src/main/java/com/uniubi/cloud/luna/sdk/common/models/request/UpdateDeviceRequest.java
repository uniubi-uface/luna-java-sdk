package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;

/**
 * com.uniubi.medusa.ares.develop.models.request.UpdateDeviceRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
@Data
public class UpdateDeviceRequest {

    /**
     * 设备序列号
     */
    private String deviceKey;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 设备密码
     */
    private String devicePass;

    /**
     * 设备分组
     */
    private String deviceGroupId;

    /**
     * 设备语言（en（英文），zh-CN（中文））
     */
    private String lang;

}
