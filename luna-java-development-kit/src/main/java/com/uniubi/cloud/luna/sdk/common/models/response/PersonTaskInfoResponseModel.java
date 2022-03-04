package com.uniubi.cloud.luna.sdk.common.models.response;

import lombok.Data;

/**
 * com.uniubi.medusa.ares.develop.models.response.PersonTaskInfoResponseModel
 * @author jingmu
 * @since 2020/5/18
 */
@Data

public class PersonTaskInfoResponseModel {

    private String empNo;

    private String empName;

    private String faceId;

    private String deviceName;

    private String deviceKey;

    private Boolean success;

    private String failedReason;

}
