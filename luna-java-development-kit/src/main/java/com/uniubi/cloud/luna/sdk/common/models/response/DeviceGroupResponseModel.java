package com.uniubi.cloud.luna.sdk.common.models.response;

import lombok.Data;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.response.DeviceGroupResponseModel
 * @author jingmu
 * @since 2020/5/18
 */
@Data
public class DeviceGroupResponseModel {

    /**
     * 设备分组id
     */
    private String deviceGroupId;

    /**
     * 设备分组名称
     */
    private String deviceGroupName;

    /**
     * 设备数
     */
    private Integer deviceNum;

    /**
     * 设备分组数量
     */
    private String remark;

    /**
     * device Key List
     */
    private List<String> deviceKeyList;

}
