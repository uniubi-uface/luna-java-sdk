package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * UpdateDeviceAuthRequest
 *
 * @author 阿秋@niancheng
 * @since 2020/6/19
 */
@Data
public class UpdateDeviceAuthRequest {

    /**
     * 员工编号
     */
    private String empNo;

    /**
     * 设备序列号
     */
    private String deviceKey;

    /**
     * 权限有效期开始时间
     */
    private LocalDateTime permissionStartTime;

    /**
     * 权限有效期结束时间
     */
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
