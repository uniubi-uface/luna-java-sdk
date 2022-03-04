package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;

/**
 * com.uniubi.medusa.ares.develop.common.models.request.DeletePersonFaceRequest
 * @author jingmu
 * @since 2020/6/18
 */
@Data
public class DeletePersonFaceRequest {

    /**
     * 人员id
     */
    private String empNo;

    /**
     * 人像id
     * <p>
     * photo id,not face id
     */
    private String photoId;

}
