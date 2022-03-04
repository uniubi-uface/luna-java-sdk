package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * com.uniubi.medusa.ares.develop.models.request.UpdateDeviceConfigRequest
 *
 * @author jingmu
 * @since 2020/5/19
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UpdateDeviceConfigRequest extends DeviceOperatorBaseRequest {

    private Integer recModeCardEnable;

    private Integer cardEnable;

    private Integer recModeCardFaceEnable;

    private Integer cardFaceEnable;

    private Integer recModeCardFaceHardware;

    private Integer cardFaceHardware;

    private Integer recModeCardFaceIntf;

    private Integer cardFaceIntf;

    private Integer recDoubleValue;

    private Integer cardFaceScore;

    private Integer recModeCardHardware;

    private Integer cardHardware;

    private Integer recModeCardIntf;

    private Integer cardInf;

    private Integer identifyDistance;

    private Integer comRecDistModeType;

    private Integer recRank;

    private Integer comRecRank;

    private Integer saveIdentifyTime;

    private Integer comRecTimeWindow;

    private Integer delayTimeForCloseDoor;

    private Integer comRelayTime;

    private Integer multiplayerDetection;

    private Integer faceDetectionType;

    private Integer recModeFaceEnable;

    private Integer faceEnable;

    private Integer identifyScores;

    private Integer faceScore;

    private Integer recModeIdcardFaceEnable;

    private Integer idCardFaceEnable;

    private Integer recModeIdcardFaceHardware;

    private Integer idCardFaceHardware;

    private Integer recModeIdcardFaceIntf;

    private Integer idCardFaceIntf;

    private Integer recCardFaceValue;

    private Integer idCardFaceScore;

    private Integer showDeviceKey;

    private Integer isShowDeviceKey;

    private Integer showIp;

    private Integer isShowIP;

    private Integer showPeopleNum;

    private Integer isShowPersonCount;

    private String serialOutContent;

    private String recFailComModeContent;

    private Integer serialOutMode;

    private Integer recFailComModeType;

    private String displayModStrangerContent;

    private String recFailDisplayTextContent;

    private Integer displayModStrangerType;

    private Integer recFailDisplayTextType;

    private Integer recStrangerType;

    private Integer recFailEnable;

    private Integer relaySwitch;

    private Integer recFailRelayType;

    private Integer recStrangerTimesThreshold;

    private Integer recFailTimesThreshold;

    private String ttsModStrangerContent;

    private String recFailTtsModeContent;

    private Integer ttsModStrangerType;

    private Integer recFailTtsModeType;

    private String weigenContent;

    private String recFailWiegandContent;

    private Integer recFailWiegandType;

    private String recNoPerComModeContent;

    private Integer recNoPerComModeType;

    private String recNoPerDisplayText1Content;

    private Integer recNoPerDisplayText1Type;

    private String recNoPerDisplayText2Content;

    private Integer recNoPerDisplayText2Type;

    private Integer recNoPerRelayType;

    private String recNoPerTtsModeContent;

    private Integer recNoPerTtsModeType;

    private String recNoPerWiegandContent;

    private Integer recNoPerWiegandType;

    private String comModContent;

    private String recSucComModeContent;

    private Integer comModType;

    private Integer recSucComModeType;

    private String displayModContent;

    private String recSucDisplayText1Content;

    private Integer displayModType;

    private Integer recSucDisplayText1Type;

    private String recSucDisplayText2Content;

    private Integer recSucDisplayText2Type;

    private Integer isOpenRelay;

    private Integer recSucRelayType;

    private Integer ttsModType;

    private Integer recSucTtsModeType;

    private String ttsModContent;

    private String recSucTtsModeContent;

    private String wg;

    private String recSucWiegandContent;

    private Integer recSucWiegandType;

    private String scrDisplayText1Content;

    private Integer scrDisplayText1Type;

    private String companyName;

    private String scrDisplayText2Content;

    private Integer scrDisplayText2Type;

    private Integer orientation;

    private Integer scrOrntType;

    private String slogan;

    private String intro;

    /**
     * 白名单开关
     */
    private Integer whitelist;

    /**
     * 照片开关
     */
    private Integer recModeCardPhoto;

    /**
     * 显示图片1
     */
    private String scrImage1Url;

    /**
     * 显示图片2、logo
     */
    private String scrImage2Url;

    /**
     * 显示设备禁用图片
     */
    private String scrDisableUrl;

    /**
     * 大屏背景
     */
    private String bigScrUrl;

    /**
     * 大屏模式
     */
    private Integer screenMode;

    /**
     * 应用名称【设备组】
     */
    private String applicationName;

}
