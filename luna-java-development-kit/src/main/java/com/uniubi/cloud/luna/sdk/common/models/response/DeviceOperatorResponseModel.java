package com.uniubi.cloud.luna.sdk.common.models.response;

import lombok.Data;

/**
 * com.uniubi.medusa.ares.develop.models.response.DeviceOperatorResponseModel
 *
 * @author jingmu
 * @since 2020/5/19
 */
@Data
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

}
