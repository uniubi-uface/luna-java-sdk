package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.annotation.RequestParam;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;
import com.uniubi.cloud.luna.sdk.common.models.request.AddDeviceGroupRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.UpdateDeviceGroupRequest;
import com.uniubi.cloud.luna.sdk.common.models.response.DeviceGroupResponseModel;

import java.util.List;

/**
 * Device Group API
 * @author jingmu
 * @since 2020/5/18
 */
public interface SdkDeviceGroupApi {

    /**
     * add Device Group
     * @param addDeviceGroupRequest request params
     * @return the group id
     */
    @RequestMark(name = "addDeviceGroup", desc = "添加设备分组")
    SdkResult<String> addDeviceGroup(AddDeviceGroupRequest addDeviceGroupRequest);

    /**
     * delete Device Group
     * @param deviceGroupId parameter
     * @return Void
     */
    @RequestMark(name = "deleteDeviceGroup", desc = "删除设备分组")
    SdkResult<Void> deleteDeviceGroup(@RequestParam("deviceGroupId") String deviceGroupId);

    /**
     * update Device Group
     * @param updateDeviceGroupRequest the request parameter
     * @return void
     */
    @RequestMark(name = "updateDeviceGroup", desc = "更新设备分组")
    SdkResult<Void> updateDeviceGroup(UpdateDeviceGroupRequest updateDeviceGroupRequest);

    /**
     * list All Device Group
     * @return DeviceGroupResponseModel
     */
    @RequestMark(name = "listAllDeviceGroup", desc = "获取所有设备分组")
    SdkResult<List<DeviceGroupResponseModel>> listAllDeviceGroup();

}
