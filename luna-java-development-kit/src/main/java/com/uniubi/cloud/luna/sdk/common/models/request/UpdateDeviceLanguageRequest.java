package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * com.uniubi.medusa.ares.develop.models.request.UpdateDeviceLanguageRequest
 * @author jingmu
 * @since 2020/5/19
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UpdateDeviceLanguageRequest extends DeviceOperatorBaseRequest {

    /**
     * 设备语言（en(英文) zh-CN(中文) ）
     */
    private String lang;

}
