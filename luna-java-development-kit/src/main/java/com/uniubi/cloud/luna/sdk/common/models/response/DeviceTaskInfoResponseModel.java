package com.uniubi.cloud.luna.sdk.common.models.response;

import lombok.Data;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.response.DeviceTaskInfoResponseModel
 *
 * @author jingmu
 * @since 2020/5/18
 */
@Data

public class DeviceTaskInfoResponseModel {

    private String deviceKey;

    private String deviceName;

    private Byte taskStatus;

    private Byte authStatus;

    private List<PersonTaskInfoResponseModel> personSubTaskInfoList;

}
