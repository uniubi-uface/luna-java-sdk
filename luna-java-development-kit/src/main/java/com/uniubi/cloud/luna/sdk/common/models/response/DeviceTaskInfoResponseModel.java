package com.uniubi.cloud.luna.sdk.common.models.response;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.response.DeviceTaskInfoResponseModel
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class DeviceTaskInfoResponseModel {

    private String deviceKey;

    private String deviceName;

    private Byte taskStatus;

    private Byte authStatus;

    private List<PersonTaskInfoResponseModel> personSubTaskInfoList;

    public String getDeviceKey() {
        return deviceKey;
    }

    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Byte getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Byte taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Byte getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(Byte authStatus) {
        this.authStatus = authStatus;
    }

    public List<PersonTaskInfoResponseModel> getPersonSubTaskInfoList() {
        return personSubTaskInfoList;
    }

    public void setPersonSubTaskInfoList(List<PersonTaskInfoResponseModel> personSubTaskInfoList) {
        this.personSubTaskInfoList = personSubTaskInfoList;
    }

    @Override
    public String toString() {
        return "DeviceTaskInfoResponseModel{" + "deviceKey='" + deviceKey + '\'' + ", deviceName='" + deviceName + '\''
                + ", taskStatus=" + taskStatus + ", authStatus=" + authStatus + ", personSubTaskInfoList="
                + personSubTaskInfoList + '}';
    }

}
