package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;

/**
 * com.uniubi.medusa.ares.develop.common.models.request.AddPersonFaceRequest
 *
 * @author jingmu
 * @since 2020/6/18
 */
@Data
public class AddPersonFaceRequest {

    /**
     * 人员id
     */
    private String empNo;

    /**
     * 文件数据
     * <p>
     * face file data
     */
    private byte[] faceData;

}
