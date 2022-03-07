package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.models.request.DeviceAuthPermissionTimeEntry
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class DeviceAuthPermissionTimeEntry {

    /**
     * 开始时间 格式为：HH:mm
     */
    private String startTime;

    /**
     * 结束时间 HH:mm
     */
    private String endTime;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "DeviceAuthPermissionTimeEntry{" +
                "startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
