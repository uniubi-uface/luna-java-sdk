package com.uniubi.cloud.luna.sdk.common.models.response;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * com.uniubi.medusa.ares.develop.models.response.RecognitionResponseModel
 *
 * @author jingmu
 * @since 2020/5/18
 */
@Data
public class RecognitionResponseModel {

    /**
     * 识别人员编号
     */
    private String empNo;

    /**
     * 识别模式 1：人像识别 2：刷卡识别 3：人卡合一 4：人证比对
     */
    private Byte recMode;

    /**
     * 识别设备序列号
     */
    private String deviceKey;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 识别时间
     */
    private LocalDateTime recTime;

    /**
     * 团队id
     */
    private String orgId;

    /**
     * 实时体温
     */
    private Double temperature;

    /**
     * 照片id
     */
    private String imageId;

    /**
     * 体温状态 1：正常 2：异常 3：未设置
     */
    private Byte temperatureState;

}
