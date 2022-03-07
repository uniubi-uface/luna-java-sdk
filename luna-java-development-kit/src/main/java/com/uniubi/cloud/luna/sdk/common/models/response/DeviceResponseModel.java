package com.uniubi.cloud.luna.sdk.common.models.response;

import java.time.LocalDateTime;
import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.response.DeviceResponseModel
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class DeviceResponseModel {

    /**
     * 设备序列号
     * <p>
     * Device Serial No
     */
    private String deviceKey;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 设备状态
     * <p>
     * device status
     */
    private Byte status;

    /**
     * 设备启用禁用状态
     * <p>
     * Enable the Disable status
     */
    private Boolean enable;

    /**
     * 设备异常类型
     * <p>
     * Device abnormality type
     */
    private Byte expType;

    /**
     * 设备团队id
     * <p>
     * organization id
     */
    private String orgId;

    /**
     * 设备软件版本
     * <p>
     * device software version
     */
    private String softwareVersion;

    /**
     * 设备算法版本
     * <p>
     * Device algorithm version
     */
    private String sdkVersion;

    /**
     * 设备是否和系统兼容
     * <p>
     * Whether device compatible with system
     */
    private Boolean versionCompatibility;

    /**
     * 设备ip地址
     */
    private String deviceIp;

    /**
     * 设备识别模式
     */
    private List<Byte> recognitionMode;

    /**
     * 设备所在分组id
     */
    private String deviceGroupId;

    /**
     * 设备所在分组名称
     */
    private String deviceGroupName;

    /**
     * 设备语言
     * <p>
     * Device language
     */
    private String lang;

    /**
     * 设备创建时间
     * <p>
     * Device creation time
     */
    private LocalDateTime createTime;

    /**
     * 设备修改时间
     * <p>
     * Device modification time
     */
    private LocalDateTime modifyTime;

    /**
     * 设备人像数量
     */
    private Integer faceNum;

    /**
     * 设备人员数量
     */
    private Integer personNum;

    /**
     * 设备是否支持刷卡
     * <p>
     * Whether device supports cards
     */
    private Boolean cardSupport;

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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Byte getExpType() {
        return expType;
    }

    public void setExpType(Byte expType) {
        this.expType = expType;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getSdkVersion() {
        return sdkVersion;
    }

    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public Boolean getVersionCompatibility() {
        return versionCompatibility;
    }

    public void setVersionCompatibility(Boolean versionCompatibility) {
        this.versionCompatibility = versionCompatibility;
    }

    public String getDeviceIp() {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }

    public List<Byte> getRecognitionMode() {
        return recognitionMode;
    }

    public void setRecognitionMode(List<Byte> recognitionMode) {
        this.recognitionMode = recognitionMode;
    }

    public String getDeviceGroupId() {
        return deviceGroupId;
    }

    public void setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
    }

    public String getDeviceGroupName() {
        return deviceGroupName;
    }

    public void setDeviceGroupName(String deviceGroupName) {
        this.deviceGroupName = deviceGroupName;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getFaceNum() {
        return faceNum;
    }

    public void setFaceNum(Integer faceNum) {
        this.faceNum = faceNum;
    }

    public Integer getPersonNum() {
        return personNum;
    }

    public void setPersonNum(Integer personNum) {
        this.personNum = personNum;
    }

    public Boolean getCardSupport() {
        return cardSupport;
    }

    public void setCardSupport(Boolean cardSupport) {
        this.cardSupport = cardSupport;
    }

    @Override
    public String toString() {
        return "DeviceResponseModel{" + "deviceKey='" + deviceKey + '\'' + ", deviceName='" + deviceName + '\''
                + ", status=" + status + ", enable=" + enable + ", expType=" + expType + ", orgId='" + orgId + '\''
                + ", softwareVersion='" + softwareVersion + '\'' + ", sdkVersion='" + sdkVersion + '\''
                + ", versionCompatibility=" + versionCompatibility + ", deviceIp='" + deviceIp + '\''
                + ", recognitionMode=" + recognitionMode + ", deviceGroupId='" + deviceGroupId + '\''
                + ", deviceGroupName='" + deviceGroupName + '\'' + ", lang='" + lang + '\'' + ", createTime="
                + createTime + ", modifyTime=" + modifyTime + ", faceNum=" + faceNum + ", personNum=" + personNum
                + ", cardSupport=" + cardSupport + '}';
    }

}
