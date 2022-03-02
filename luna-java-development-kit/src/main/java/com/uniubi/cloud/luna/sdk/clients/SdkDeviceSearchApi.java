package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;
import com.uniubi.cloud.luna.sdk.common.models.response.DeviceSearchResponseModel;

import java.util.List;

/**
 * Search Device API
 *
 * @author jingmu
 * @since 2020/5/18
 */
public interface SdkDeviceSearchApi {

    /**
     * start Search Device task
     * @return void
     */
    @RequestMark(name = "startSearchDevice", desc = "开始搜索设备")
    SdkResult<Void> startSearchDevice();

    /**
     * get Device Search Task result
     * @return the device list of search task.
     */
    @RequestMark(name = "getDeviceSearchTask", desc = "获取设备搜索任务详情")
    SdkResult<List<DeviceSearchResponseModel>> getDeviceSearchTask();

}
