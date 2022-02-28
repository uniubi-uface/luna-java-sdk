package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.models.SDKResult;
import com.uniubi.cloud.luna.sdk.common.models.request.DeviceOperatorBaseRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.ResetDeviceRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.UpdateDeviceConfigRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.UpdateDeviceLanguageRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.UpdateDeviceNetConfigRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.UpdateDeviceTimeRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.UpdateDeviceWifiConfigRequest;
import com.uniubi.cloud.luna.sdk.common.models.response.DeviceOperatorResponseModel;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.api.clients.SdkDeviceCommandApi
 *
 * @author jingmu
 * @since 2020/5/18
 */
public interface SdkDeviceCommandApi {

    @RequestMark(name = "restartDevice", desc = "重启设备")
    SDKResult<List<DeviceOperatorResponseModel>> restartDevice(DeviceOperatorBaseRequest deviceOperatorBaseRequest);

    @RequestMark(name = "resetDevice", desc = "重置设备")
    SDKResult<List<DeviceOperatorResponseModel>> resetDevice(ResetDeviceRequest resetDeviceRequest);

    @RequestMark(name = "disableDevice", desc = "禁用设备")
    SDKResult<List<DeviceOperatorResponseModel>> disableDevice(DeviceOperatorBaseRequest deviceOperatorBaseRequest);

    @RequestMark(name = "enableDevice", desc = "启用设备")
    SDKResult<List<DeviceOperatorResponseModel>> enableDevice(DeviceOperatorBaseRequest deviceOperatorBaseRequest);

    @RequestMark(name = "clearDeviceData", desc = "清空设备数据")
    SDKResult<List<DeviceOperatorResponseModel>> clearDeviceData(DeviceOperatorBaseRequest deviceOperatorBaseRequest);

    @RequestMark(name = "updateDeviceConfig", desc = "更新设备配置")
    @Deprecated
    SDKResult<List<DeviceOperatorResponseModel>> updateDeviceConfig(
            UpdateDeviceConfigRequest updateDeviceConfigRequest);

    @RequestMark(name = "setDeviceDefaultConfig", desc = "恢复设备默认配置")
    @Deprecated
    SDKResult<List<DeviceOperatorResponseModel>> setDeviceDefaultConfig(
            DeviceOperatorBaseRequest deviceOperatorBaseRequest);

    @RequestMark(name = "updateDeviceNetConfig", desc = "更新设备网络配置（有线）")
    @Deprecated
    SDKResult<List<DeviceOperatorResponseModel>> updateDeviceNetConfig(
            UpdateDeviceNetConfigRequest updateDeviceNetConfigRequest);

    @RequestMark(name = "updateDeviceWifiConfig", desc = "更新设备wifi网络配置")
    @Deprecated
    SDKResult<List<DeviceOperatorResponseModel>> updateDeviceWifiConfig(
            UpdateDeviceWifiConfigRequest updateDeviceWifiConfigRequest);

    @RequestMark(name = "setDeviceTime", desc = "设置设备时间")
    SDKResult<List<DeviceOperatorResponseModel>> setDeviceTime(UpdateDeviceTimeRequest updateDeviceTimeRequest);

    @RequestMark(name = "updateDeviceLanguage", desc = "设置设备语言")
    SDKResult<List<DeviceOperatorResponseModel>> updateDeviceLanguage(
            UpdateDeviceLanguageRequest updateDeviceLanguageRequest);

}
