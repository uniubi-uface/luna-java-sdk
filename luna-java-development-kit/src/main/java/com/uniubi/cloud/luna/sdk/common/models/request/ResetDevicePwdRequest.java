package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * com.uniubi.medusa.ares.develop.models.request.ResetDevicePwdRequest
 *
 * @author jingmu
 * @since 2020/5/19
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResetDevicePwdRequest extends DeviceOperatorBaseRequest {

    /**
     * 管理员密码
     */
    private String adminPass;

    /**
     * 设备新密码
     */
    private String newPass;

}
