package com.uniubi.cloud.luna.sdk.common.models.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.request.DeviceAuthPermissionTime
 *
 * @author jingmu
 * @since 2020/5/18
 */
@Data
public class DeviceAuthPermissionTime {

    /**
     * 权限起始时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime permissionStartTime;

    /**
     * 权限结束时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime permissionEndTime;

    /**
     * 权限时间段设置
     */
    private List<DeviceAuthPermissionTimeEntry> permissionTimeEntries;

}
