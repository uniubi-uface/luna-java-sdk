package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.annotation.RequestParam;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;
import com.uniubi.cloud.luna.sdk.common.models.request.AddDeviceGroupRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.UpdateDeviceGroupRequest;
import com.uniubi.cloud.luna.sdk.common.models.response.DeviceGroupResponseModel;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.api.clients.SdkDeviceGroupApi
 *
 * @author jingmu
 * @since 2020/5/18
 */
public interface SdkDeviceGroupApi {

    @RequestMark(name = "addDeviceGroup", desc = "添加设备分组")
    SdkResult<String> addDeviceGroup(AddDeviceGroupRequest addDeviceGroupRequest);

    @RequestMark(name = "deleteDeviceGroup", desc = "删除设备分组")
    SdkResult<Void> deleteDeviceGroup(@RequestParam("deviceGroupId") String deviceGroupId);

    @RequestMark(name = "updateDeviceGroup", desc = "更新设备分组")
    SdkResult<Void> updateDeviceGroup(UpdateDeviceGroupRequest updateDeviceGroupRequest);

    @RequestMark(name = "listAllDeviceGroup", desc = "获取所有设备分组")
    SdkResult<List<DeviceGroupResponseModel>> listAllDeviceGroup();

}
