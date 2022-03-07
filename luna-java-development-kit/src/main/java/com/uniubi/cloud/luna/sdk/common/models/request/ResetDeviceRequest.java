package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.models.request.ResetDeviceRequest
 *
 * @author jingmu
 * @since 2020/5/19
 */
public class ResetDeviceRequest extends DeviceOperatorBaseRequest {

    /**
     * 是否恢复出厂配置 如果否，则只清除设备人员和人像数据 如果是，则不仅会清除设备人员和人像数据，还会清除掉设备的配置，比如密码，回调响应地址等配置信息
     */
    private Boolean factoryDataReset;

    public Boolean getFactoryDataReset() {
        return factoryDataReset;
    }

    public void setFactoryDataReset(Boolean factoryDataReset) {
        this.factoryDataReset = factoryDataReset;
    }

    @Override
    public String toString() {
        return "ResetDeviceRequest{" + "factoryDataReset=" + factoryDataReset + '}';
    }

}
