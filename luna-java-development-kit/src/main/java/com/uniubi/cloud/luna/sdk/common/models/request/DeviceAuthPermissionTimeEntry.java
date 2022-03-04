package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;

/**
 * com.uniubi.medusa.ares.develop.models.request.DeviceAuthPermissionTimeEntry
 * @author jingmu
 * @since 2020/5/18
 */
@Data
public class DeviceAuthPermissionTimeEntry {

    /**
     * 开始时间 格式为：HH:mm
     */
    private String startTime;

    /**
     * 结束时间 HH:mm
     */
    private String endTime;

}
