package com.uniubi.cloud.luna.sdk.common.models.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * AddDeviceAuthRequest
 * @author 阿秋@niancheng
 * @since 2020/6/19
 */
@Data
public class AddDeviceAuthRequest {

    /**
     * Employee No
     */
    private String empNo;

    /**
     * Device SN
     */
    private String deviceKey;

    /**
     * Whether to store the original drawing. If yes, the original drawing will be sent to the device.
     * If not, the sectional drawing will be sent to the device
     */
    private Boolean imgStoreDevice;

    /**
     * 权限有效期开始时间
     * <p>
     * Start time of the Permission validity period
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime permissionStartTime;

    /**
     * 权限有效期结束时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime permissionEndTime;

    /**
     * 权限时间段（最多六段）
     */
    private List<DeviceAuthPermissionTimeEntry> permissionTimeEntries;

    /**
     * 识别类型 1.人像识别 2.刷卡识别 3.人卡合一 4.人证对比
     */
    private List<Byte> recognitionTypes;

}
