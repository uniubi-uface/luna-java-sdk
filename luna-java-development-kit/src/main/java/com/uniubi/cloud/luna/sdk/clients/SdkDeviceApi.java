package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.annotation.RequestParam;
import com.uniubi.cloud.luna.sdk.common.models.SDKPageInfo;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;
import com.uniubi.cloud.luna.sdk.common.models.request.AddDeviceRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.QueryDevicePageRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.UpdateDeviceRequest;
import com.uniubi.cloud.luna.sdk.common.models.response.DeviceResponseModel;

/**
 * com.uniubi.medusa.ares.develop.api.clients.SdkDeviceApi
 *
 * @author jingmu
 * @since 2020/5/18
 */
public interface SdkDeviceApi {

    @RequestMark(name = "addDevice", desc = "添加设备")
    SdkResult<String> addDevice(AddDeviceRequest addDeviceRequest);

    @RequestMark(name = "forceDeleteDevice", desc = "强制删除设备")
    SdkResult<Void> deleteDevice(@RequestParam("deviceKey") String deviceKey);

    @RequestMark(name = "updateDevice", desc = "更新设备")
    SdkResult<Void> updateDevice(UpdateDeviceRequest updateDeviceRequest);

    @RequestMark(name = "getDevice", desc = "获取设备")
    SdkResult<DeviceResponseModel> getDevice(@RequestParam("deviceKey") String deviceKey);

    @RequestMark(name = "queryDevicePage", desc = "查询设备分页")
    SdkResult<SDKPageInfo<DeviceResponseModel>> queryDevice(QueryDevicePageRequest queryDevicePageRequest);

}
