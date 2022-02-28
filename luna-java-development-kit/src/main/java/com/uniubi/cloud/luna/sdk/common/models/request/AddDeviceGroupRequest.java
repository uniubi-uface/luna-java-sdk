package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.request.AddDeviceGroupRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
@Data
public class AddDeviceGroupRequest {

    /**
     * 设备组名称
     */
    private String deviceGroupName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 设备序列号
     */
    private List<String> deviceKeyList;

}
