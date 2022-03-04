package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * com.uniubi.medusa.ares.develop.models.request.ResetDeviceRequest
 *
 * @author jingmu
 * @since 2020/5/19
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResetDeviceRequest extends DeviceOperatorBaseRequest {

    /**
     * 是否恢复出厂配置 如果否，则只清除设备人员和人像数据 如果是，则不仅会清除设备人员和人像数据，还会清除掉设备的配置，比如密码，回调响应地址等配置信息
     */
    private Boolean factoryDataReset;

}
