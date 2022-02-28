package com.uniubi.cloud.luna.sdk.common.models.response;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.response.DeviceResponseModel
 *
 * @author jingmu
 * @since 2020/5/18
 */
@Data
public class DeviceResponseModel {

    /**
     * 设备序列号
     */
    private String deviceKey;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 设备状态
     */
    private Byte status;

    /**
     * 设备启用禁用状态
     */
    private Boolean enable;

    /**
     * 设备异常类型
     */
    private Byte expType;

    /**
     * 设备团队id
     */
    private String orgId;

    /**
     * 设备软件版本
     */
    private String softwareVersion;

    /**
     * 设备算法版本
     */
    private String sdkVersion;

    /**
     * 设备是否和系统兼容
     */
    private Boolean versionCompatibility;

    /**
     * 设备ip地址
     */
    private String deviceIp;

    /**
     * 设备识别模式
     */
    private List<Byte> recognitionMode;

    /**
     * 设备所在分组id
     */
    private String deviceGroupId;

    /**
     * 设备所在分组名称
     */
    private String deviceGroupName;

    /**
     * 设备语言
     */
    private String lang;

    /**
     * 设备创建时间
     */
    private LocalDateTime createTime;

    /**
     * 设备修改时间
     */
    private LocalDateTime modifyTime;

    /**
     * 设备人像数量
     */
    private Integer faceNum;

    /**
     * 设备人员数量
     */
    private Integer personNum;

    /**
     * 设备是否支持刷卡
     */
    private Boolean cardSupport;

}
