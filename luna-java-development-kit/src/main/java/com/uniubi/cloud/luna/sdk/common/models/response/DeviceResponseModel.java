package com.uniubi.cloud.luna.sdk.common.models.response;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.response.DeviceResponseModel
 * @author jingmu
 * @since 2020/5/18
 */
@Data
public class DeviceResponseModel {

    /**
     * 设备序列号
     * <p>
     * Device Serial No
     */
    private String deviceKey;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 设备状态
     * <p>
     * device status
     */
    private Byte status;

    /**
     * 设备启用禁用状态
     * <p>
     * Enable the Disable status
     */
    private Boolean enable;

    /**
     * 设备异常类型
     * <p>
     * Device abnormality type
     */
    private Byte expType;

    /**
     * 设备团队id
     * <p>
     * organization id
     */
    private String orgId;

    /**
     * 设备软件版本
     * <p>
     * device software version
     */
    private String softwareVersion;

    /**
     * 设备算法版本
     * <p>
     * Device  algorithm  version
     */
    private String sdkVersion;

    /**
     * 设备是否和系统兼容
     * <p>
     * Whether device compatible with system
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
     * <p>
     * Device language
     */
    private String lang;

    /**
     * 设备创建时间
     * <p>
     * Device creation time
     */
    private LocalDateTime createTime;

    /**
     * 设备修改时间
     * <p>
     * Device modification time
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
     * <p>
     * Whether device supports cards
     */
    private Boolean cardSupport;

}
