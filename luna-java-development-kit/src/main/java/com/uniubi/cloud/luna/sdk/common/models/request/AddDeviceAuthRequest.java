package com.uniubi.cloud.luna.sdk.common.models.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * AddDeviceAuthRequest
 *
 * @author 阿秋@niancheng
 * @since 2020/6/19
 */
@Data
public class AddDeviceAuthRequest {

    /**
     * 员工编号
     */
    private String empNo;

    /**
     * 设备序列号
     */
    private String deviceKey;

    /**
     * 是否存储原图
     */
    private Boolean imgStoreDevice;

    /**
     * 权限有效期开始时间
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
