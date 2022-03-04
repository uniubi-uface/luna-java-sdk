package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;

/**
 * DeleteDeviceAuthRequest
 *
 * @author 阿秋@niancheng description default
 * @since 2020/6/19
 */
@Data
public class DeleteDeviceAuthRequest {

    /**
     * 员工编号
     */
    private String empNo;

    /**
     * 设备序列号
     */
    private String deviceKey;

}
