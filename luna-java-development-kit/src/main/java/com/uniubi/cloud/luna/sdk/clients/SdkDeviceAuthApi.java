package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.models.SDKPageInfo;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;
import com.uniubi.cloud.luna.sdk.common.models.request.AddDeviceAuthRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.DeleteDeviceAuthRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.DeviceAuthQueryPageRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.UpdateDeviceAuthRequest;
import com.uniubi.cloud.luna.sdk.common.models.response.DeviceAuthResponseModel;

/**
 * 授权相关API
 * <p>
 * Authorization API
 *
 * @author jingmu
 * @since 2020/5/18
 */
public interface SdkDeviceAuthApi {

    /**
     * add Device Auth
     * @param addDeviceAuthRequest params
     * @return Void
     */
    @RequestMark(name = "addDeviceAuth", desc = "添加授权")
    SdkResult<Void> addDeviceAuth(AddDeviceAuthRequest addDeviceAuthRequest);

    /**
     * update Device Auth Request
     * @param updateDeviceAuthRequest Request params
     * @return Void
     */
    @RequestMark(name = "updateDeviceAuthRequest", desc = "更新授权")
    SdkResult<Void> updateDeviceAuth(UpdateDeviceAuthRequest updateDeviceAuthRequest);

    /**
     * delete Device Auth
     * @param deleteDeviceAuthRequest delete Device Auth Request params
     * @return Void
     */
    @RequestMark(name = "deleteDeviceAuth", desc = "删除授权")
    SdkResult<Void> deleteDeviceAuth(DeleteDeviceAuthRequest deleteDeviceAuthRequest);

    /**
     * query Device Auth Page
     * @param deviceAuthQueryPageRequest params
     * @return DeviceAuthResponseModel
     */
    @RequestMark(name = "queryDeviceAuthPage", desc = "查询授权分页")
    SdkResult<SDKPageInfo<DeviceAuthResponseModel>> queryDeviceAuthPage(
            DeviceAuthQueryPageRequest deviceAuthQueryPageRequest);

}
