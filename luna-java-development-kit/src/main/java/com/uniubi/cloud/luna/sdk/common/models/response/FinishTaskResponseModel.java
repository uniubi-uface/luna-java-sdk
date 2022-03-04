package com.uniubi.cloud.luna.sdk.common.models.response;

import lombok.Data;

/**
 * com.uniubi.medusa.ares.develop.models.response.FinishTaskResponseModel
 * @author jingmu
 * @since 2020/5/18
 */
@Data

public class FinishTaskResponseModel {

    private Boolean success;

    private String failedReason;

    private DeviceTaskInfoResponseModel taskInfo;

}
