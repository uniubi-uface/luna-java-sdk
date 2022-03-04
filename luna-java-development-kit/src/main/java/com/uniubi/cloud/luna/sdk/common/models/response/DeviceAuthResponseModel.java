package com.uniubi.cloud.luna.sdk.common.models.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.uniubi.cloud.luna.sdk.common.models.request.DeviceAuthPermissionTime;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.response.DeviceAuthResponseModel
 * @author jingmu
 * @since 2020/5/18
 */
@Data
public class DeviceAuthResponseModel {

    /**
     * 员工编号
     */
    private String empNo;

    /**
     * 设备序列号
     */
    private String deviceKey;

    /**
     * 员工权限类型
     */
    private List<Byte> recModeTypes;

    /**
     * 员工授权的人像
     */
    private List<AresPersonFaceResponseModel> faces;

    /**
     * 人员时间权限
     */
    private DeviceAuthPermissionTime permissionTime;

    /**
     * 授权创建时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

}
