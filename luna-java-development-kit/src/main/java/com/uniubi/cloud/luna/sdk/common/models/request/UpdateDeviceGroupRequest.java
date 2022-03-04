package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.request.UpdateDeviceGroupRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
@Data
public class UpdateDeviceGroupRequest {

    /**
     * 设备组id
     */
    private String deviceGroupId;

    /**
     * 设备组名称
     */
    private String deviceGroupName;

    /**
     * 设备序列号
     */
    private List<String> deviceKeyList;

    /**
     * 设备组备注
     */
    private String remark;

}
