package com.uniubi.cloud.luna.sdk.common.models.request;

import com.uniubi.cloud.luna.sdk.common.models.SDKBasePageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.request.QueryDevicePageRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QueryDevicePageRequest extends SDKBasePageRequest {

    /**
     * 设备序列号
     */
    private String deviceKey;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 设备ip
     */
    private String deviceIp;

    /**
     * 设备分组
     */
    private String deviceGroupId;

    /**
     * 设备状态
     */
    private Byte status;

    /**
     * 识别模式(1-人像识别 2-刷卡识别 3-人卡合一 4-人证对比)
     */
    private List<Byte> recognitionModes;

    /**
     * 是否支持刷卡
     */
    private Boolean cardSupport;

}
