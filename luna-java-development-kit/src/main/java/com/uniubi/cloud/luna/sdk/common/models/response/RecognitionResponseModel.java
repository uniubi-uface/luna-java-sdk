package com.uniubi.cloud.luna.sdk.common.models.response;

import java.time.LocalDateTime;

/**
 * com.uniubi.medusa.ares.develop.models.response.RecognitionResponseModel
 * @author jingmu
 * @since 2020/5/18
 */
public class RecognitionResponseModel {

    /**
     * 识别人员编号
     * <p>
     * the person NO
     */
    private String empNo;

    /**
     * 识别模式 1：人像识别 2：刷卡识别 3：人卡合一 4：人证比对
     * <p>
     * recognition mode
     * <li>1 face</li>
     * <li>2 card</li>
     * <li>3 face&card</li>
     * <li>3 face&ID card</li>
     */
    private Byte recMode;

    /**
     * 识别设备序列号
     */
    private String deviceKey;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 识别时间
     * <p>
     * recognition time
     */
    private LocalDateTime recTime;

    /**
     * 团队id
     * <p>
     * organization id
     */
    private String orgId;

    /**
     * 照片id
     * <p>
     * image id
     */
    private String imageId;

    /**
     * 人员比对结果 1：比对成功 2：比对失败 3：未进行比对
     * <p>
     * success compare person
     * <li>1 success</li>
     * <li>2 failed</li>
     * <li>3 No comparison</li>
     */
    private Byte identifyType;

    /**
     * 实时体温
     */
    private Double temperature;

    /**
     * 体温状态 1：正常 2：异常 3：未设置
     * <p>
     * temperature State
     * <li>1 normal</li>
     * <li>2 abnormal</li>
     * <li>3 Not set</li>
     */
    private Byte temperatureState;

    /**
     * 体温单位 1:摄氏度 2：华氏度
     * <p>
     * temperature Unit
     * <li>1 centigrade ℃</li>
     * <li>2 Fahrenheit degree ℉</li>
     */
    private Byte temperatureUnit;

    /**
     * 活体 活体判断结果 1：活体判断成功 2：活体判断失败 3：未进行活体判断
     *
     * <li>1 alive body</li>
     * <li>2 not alive body</li>
     * <li>3 No living judgment was performed</li>
     */
    private Byte aliveBody;

    /**
     * 有效日期判断 1:有效期内，2:未在有效期内，3:未设置
     *
     * <li>1: Within the validity period</li>
     * <li>2: outside the validity period</li>
     * <li>3: the validity period is not judged</li>
     */
    private Byte permissionTimeType;

    /**
     * 有效时间段判断 1:准入时间内，2:未在准入时间内，3:未设置
     *
     * <li>1: In time period</li>
     * <li>2: out of time period</li>
     * <li>3: no time period judgment</li>
     */
    private Byte passTimeType;

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public Byte getRecMode() {
        return recMode;
    }

    public void setRecMode(Byte recMode) {
        this.recMode = recMode;
    }

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

    public LocalDateTime getRecTime() {
        return recTime;
    }

    public void setRecTime(LocalDateTime recTime) {
        this.recTime = recTime;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public Byte getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(Byte identifyType) {
        this.identifyType = identifyType;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Byte getTemperatureState() {
        return temperatureState;
    }

    public void setTemperatureState(Byte temperatureState) {
        this.temperatureState = temperatureState;
    }

    public Byte getTemperatureUnit() {
        return temperatureUnit;
    }

    public void setTemperatureUnit(Byte temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
    }

    public Byte getAliveBody() {
        return aliveBody;
    }

    public void setAliveBody(Byte aliveBody) {
        this.aliveBody = aliveBody;
    }

    public Byte getPermissionTimeType() {
        return permissionTimeType;
    }

    public void setPermissionTimeType(Byte permissionTimeType) {
        this.permissionTimeType = permissionTimeType;
    }

    public Byte getPassTimeType() {
        return passTimeType;
    }

    public void setPassTimeType(Byte passTimeType) {
        this.passTimeType = passTimeType;
    }

    @Override
    public String toString() {
        return "RecognitionResponseModel{" + "empNo='" + empNo + '\'' + ", recMode=" + recMode + ", deviceKey='"
            + deviceKey + '\'' + ", deviceName='" + deviceName + '\'' + ", recTime=" + recTime + ", orgId='" + orgId
            + '\'' + ", imageId='" + imageId + '\'' + ", identifyType=" + identifyType + ", temperature="
            + temperature + ", temperatureState=" + temperatureState + ", temperatureUnit=" + temperatureUnit
            + ", aliveBody=" + aliveBody + ", permissionTimeType=" + permissionTimeType + ", passTimeType="
            + passTimeType + '}';
    }

}
