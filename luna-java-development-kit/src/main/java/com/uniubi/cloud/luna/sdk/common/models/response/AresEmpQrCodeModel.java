package com.uniubi.cloud.luna.sdk.common.models.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author 井木
 * @since 2021/10/22
 */
public class AresEmpQrCodeModel implements Serializable {

    private static final long serialVersionUID = 8770689270460678678L;

    /**
     * 二维码ID
     */
    private String id;

    /**
     * 二维码图片ID,用于展示图片
     */
    private String fileId;

    /**
     * 二维码创建时间 yyyy-MM-dd HH:mm:ss
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime qrCodeCreateTime;

    /**
     * 二维码有效期截至时间 yyyy-MM-dd HH:mm:ss
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime qrCodeEndTime;

    /**
     * 二维码有效时间类型 1：一个月，2：三个月，3：半年，4：一年，5：永久
     */
    private Integer effectiveType;

    /**
     * 二维码内容
     */
    private String qrCodeData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public LocalDateTime getQrCodeCreateTime() {
        return qrCodeCreateTime;
    }

    public void setQrCodeCreateTime(LocalDateTime qrCodeCreateTime) {
        this.qrCodeCreateTime = qrCodeCreateTime;
    }

    public LocalDateTime getQrCodeEndTime() {
        return qrCodeEndTime;
    }

    public void setQrCodeEndTime(LocalDateTime qrCodeEndTime) {
        this.qrCodeEndTime = qrCodeEndTime;
    }

    public Integer getEffectiveType() {
        return effectiveType;
    }

    public void setEffectiveType(Integer effectiveType) {
        this.effectiveType = effectiveType;
    }

    public String getQrCodeData() {
        return qrCodeData;
    }

    public void setQrCodeData(String qrCodeData) {
        this.qrCodeData = qrCodeData;
    }

    @Override
    public String toString() {
        return "AresEmpQrCodeModel{" +
            "id='" + id + '\'' +
            ", fileId='" + fileId + '\'' +
            ", qrCodeCreateTime=" + qrCodeCreateTime +
            ", qrCodeEndTime=" + qrCodeEndTime +
            ", effectiveType=" + effectiveType +
            ", qrCodeData='" + qrCodeData + '\'' +
            '}';
    }
}
