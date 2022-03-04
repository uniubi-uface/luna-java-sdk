package com.uniubi.cloud.luna.sdk.common.models.response;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.response.DeviceAuthTaskResponseModel
 * @author jingmu
 * @since 2020/5/18
 */
@Data
public class DeviceAuthTaskResponseModel {

    private Boolean finished;

    private Integer totalSubTaskNum;

    private Integer finishedSubTaskNum;

    private Byte taskState;

    private Byte taskResult;

    private LocalDateTime taskStartDate;

    private List<FinishTaskResponseModel> finishedTaskInfoList;

}
