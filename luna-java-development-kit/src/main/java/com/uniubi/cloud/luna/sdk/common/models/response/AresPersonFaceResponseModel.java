package com.uniubi.cloud.luna.sdk.common.models.response;

import java.io.Serializable;

/**
 * com.uniubi.medusa.ares.develop.models.response.AresPersonFaceResponseModel
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class AresPersonFaceResponseModel implements Serializable {

    private static final long serialVersionUID = 500246048168639602L;

    /**
     * 人像id
     */
    private String faceId;

    /**
     * 照片id
     */
    private String photoId;

    /**
     * 照片授权状态 1：授权中 2：授权完成 3：授权失败 4：消权中 5：消权成功 6：消权失败
     */
    private Byte status;

    /**
     * 照片路径
     */
    private String photoUrl;

    /**
     * 失败原因
     */
    private String failedReason;


    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    @Override
    public String toString() {
        return "AresPersonFaceResponseModel{" +
                "faceId='" + faceId + '\'' +
                ", photoId='" + photoId + '\'' +
                ", status=" + status +
                ", photoUrl='" + photoUrl + '\'' +
                ", failedReason='" + failedReason + '\'' +
                '}';
    }
}
