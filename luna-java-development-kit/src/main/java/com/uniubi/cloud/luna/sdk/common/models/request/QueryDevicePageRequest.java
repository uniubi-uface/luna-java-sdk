package com.uniubi.cloud.luna.sdk.common.models.request;

import com.uniubi.cloud.luna.sdk.common.models.SDKBasePageRequest;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.request.QueryDevicePageRequest
 * @author jingmu
 * @since 2020/5/18
 */
public class QueryDevicePageRequest extends SDKBasePageRequest {

    /**
     * 设备序列号
     */
    private String deviceKey;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 设备ip
     */
    private String deviceIp;

    /**
     * 设备分组
     */
    private String deviceGroupId;

    /**
     * 设备状态 device status
     */
    private Byte status;

    /**
     * 识别模式(1-人像识别 2-刷卡识别 3-人卡合一 4-人证对比) Recognition mode (1.Face recognition 2.Card
     * recognition 3.Face-card-in-one 4.Face-card comparison)
     */
    private List<Byte> recognitionModes;

    /**
     * 是否支持刷卡
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

    public String getDeviceIp() {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }

    public String getDeviceGroupId() {
        return deviceGroupId;
    }

    public void setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public List<Byte> getRecognitionModes() {
        return recognitionModes;
    }

    public void setRecognitionModes(List<Byte> recognitionModes) {
        this.recognitionModes = recognitionModes;
    }

    public Boolean getCardSupport() {
        return cardSupport;
    }

    public void setCardSupport(Boolean cardSupport) {
        this.cardSupport = cardSupport;
    }

    @Override
    public String toString() {
        return "QueryDevicePageRequest{" + "deviceKey='" + deviceKey + '\'' + ", deviceName='" + deviceName + '\''
            + ", deviceIp='" + deviceIp + '\'' + ", deviceGroupId='" + deviceGroupId + '\'' + ", status=" + status
            + ", recognitionModes=" + recognitionModes + ", cardSupport=" + cardSupport + '}';
    }

}
