package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.request.StartDeviceAuthTaskRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
@Data
public class StartDeviceAuthTaskRequest {

    private List<String> empNoList;

    private List<String> depIdList;

    private List<String> deviceKeyList;

    private Boolean enablePassTime;

    private DeviceAuthPermissionTime permissionTime;

    private Boolean imgStoreDevice;

    private Boolean stopAuthWhenNotCompatibility;

    private List<Byte> recognitionTypes;

    private String orgId;

}
