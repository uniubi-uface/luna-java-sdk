package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.request.DeviceOperatorBaseRequest
 *
 * @author jingmu
 * @since 2020/5/19
 */
@Data
public class DeviceOperatorBaseRequest {

    /**
     * 批量操作的设备序列号
     */
    private List<String> deviceKeyList;

}
