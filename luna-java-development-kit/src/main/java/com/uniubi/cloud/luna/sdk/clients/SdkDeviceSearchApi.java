package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.models.SDKResult;
import com.uniubi.cloud.luna.sdk.common.models.response.DeviceSearchResponseModel;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.api.clients.SdkDeviceSearchApi
 *
 * @author jingmu
 * @since 2020/5/18
 */
public interface SdkDeviceSearchApi {

    @RequestMark(name = "startSearchDevice", desc = "开始搜索设备")
    SDKResult<Void> startSearchDevice();

    @RequestMark(name = "getDeviceSearchTask", desc = "获取设备搜索任务详情")
    SDKResult<List<DeviceSearchResponseModel>> getDeviceSearchTask();

}
