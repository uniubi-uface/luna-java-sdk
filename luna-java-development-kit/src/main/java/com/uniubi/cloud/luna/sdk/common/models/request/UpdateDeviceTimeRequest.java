package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * com.uniubi.medusa.ares.develop.models.request.UpdateDeviceTimeRequest
 * @author jingmu
 * @since 2020/5/19
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UpdateDeviceTimeRequest extends DeviceOperatorBaseRequest {

    /**
     * 时间 设置成功后，若设备未连入公网，则此时间会生效； 若设备连入公网，则会重新使用公网时间
     */
    private LocalDateTime time;

    /**
     * 时区
     */
    private String timezone;

}
