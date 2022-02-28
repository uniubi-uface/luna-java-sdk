package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.models.SDKPageInfo;
import com.uniubi.cloud.luna.sdk.common.models.SDKResult;
import com.uniubi.cloud.luna.sdk.common.models.request.AddDeviceAuthRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.DeleteDeviceAuthRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.DeviceAuthQueryPageRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.UpdateDeviceAuthRequest;
import com.uniubi.cloud.luna.sdk.common.models.response.DeviceAuthResponseModel;

/**
 * com.uniubi.medusa.ares.develop.api.clients.SdkDeviceAuthApi
 *
 * @author jingmu
 * @since 2020/5/18
 */
public interface SdkDeviceAuthApi {

    @RequestMark(name = "addDeviceAuth", desc = "添加授权")
    SDKResult<Void> addDeviceAuth(AddDeviceAuthRequest addDeviceAuthRequest);

    @RequestMark(name = "updateDeviceAuthRequest", desc = "更新授权")
    SDKResult<Void> updateDeviceAuth(UpdateDeviceAuthRequest updateDeviceAuthRequest);

    @RequestMark(name = "deleteDeviceAuth", desc = "删除授权")
    SDKResult<Void> deleteDeviceAuth(DeleteDeviceAuthRequest deleteDeviceAuthRequest);

    @RequestMark(name = "queryDeviceAuthPage", desc = "查询授权分页")
    SDKResult<SDKPageInfo<DeviceAuthResponseModel>> queryDeviceAuthPage(
            DeviceAuthQueryPageRequest deviceAuthQueryPageRequest);

}
