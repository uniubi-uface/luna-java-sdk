package com.uniubi.cloud.luna.sdk.common.models.response;

import lombok.Data;

/**
 * com.uniubi.medusa.ares.develop.models.response.AresPersonFaceResponseModel
 * @author jingmu
 * @since 2020/5/18
 */
@Data
public class AresPersonFaceResponseModel {

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

}
