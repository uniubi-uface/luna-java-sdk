package com.uniubi.cloud.luna.sdk.common.models.request;

import com.alibaba.fastjson.annotation.JSONField;

import java.time.LocalDateTime;
import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.request.DeviceAuthPermissionTime
 * @author jingmu
 * @since 2020/5/18
 */
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

    public LocalDateTime getPermissionStartTime() {
        return permissionStartTime;
    }

    public void setPermissionStartTime(LocalDateTime permissionStartTime) {
        this.permissionStartTime = permissionStartTime;
    }

    public LocalDateTime getPermissionEndTime() {
        return permissionEndTime;
    }

    public void setPermissionEndTime(LocalDateTime permissionEndTime) {
        this.permissionEndTime = permissionEndTime;
    }

    public List<DeviceAuthPermissionTimeEntry> getPermissionTimeEntries() {
        return permissionTimeEntries;
    }

    public void setPermissionTimeEntries(List<DeviceAuthPermissionTimeEntry> permissionTimeEntries) {
        this.permissionTimeEntries = permissionTimeEntries;
    }

    @Override
    public String toString() {
        return "DeviceAuthPermissionTime{" + "permissionStartTime=" + permissionStartTime + ", permissionEndTime="
            + permissionEndTime + ", permissionTimeEntries=" + permissionTimeEntries + '}';
    }

}
