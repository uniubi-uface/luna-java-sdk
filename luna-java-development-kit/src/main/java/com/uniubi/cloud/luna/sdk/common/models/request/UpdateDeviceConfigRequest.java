package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.models.request.UpdateDeviceConfigRequest
 *
 * @author jingmu
 * @since 2020/5/19
 */
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

    public Integer getRecModeCardEnable() {
        return recModeCardEnable;
    }

    public void setRecModeCardEnable(Integer recModeCardEnable) {
        this.recModeCardEnable = recModeCardEnable;
    }

    public Integer getCardEnable() {
        return cardEnable;
    }

    public void setCardEnable(Integer cardEnable) {
        this.cardEnable = cardEnable;
    }

    public Integer getRecModeCardFaceEnable() {
        return recModeCardFaceEnable;
    }

    public void setRecModeCardFaceEnable(Integer recModeCardFaceEnable) {
        this.recModeCardFaceEnable = recModeCardFaceEnable;
    }

    public Integer getCardFaceEnable() {
        return cardFaceEnable;
    }

    public void setCardFaceEnable(Integer cardFaceEnable) {
        this.cardFaceEnable = cardFaceEnable;
    }

    public Integer getRecModeCardFaceHardware() {
        return recModeCardFaceHardware;
    }

    public void setRecModeCardFaceHardware(Integer recModeCardFaceHardware) {
        this.recModeCardFaceHardware = recModeCardFaceHardware;
    }

    public Integer getCardFaceHardware() {
        return cardFaceHardware;
    }

    public void setCardFaceHardware(Integer cardFaceHardware) {
        this.cardFaceHardware = cardFaceHardware;
    }

    public Integer getRecModeCardFaceIntf() {
        return recModeCardFaceIntf;
    }

    public void setRecModeCardFaceIntf(Integer recModeCardFaceIntf) {
        this.recModeCardFaceIntf = recModeCardFaceIntf;
    }

    public Integer getCardFaceIntf() {
        return cardFaceIntf;
    }

    public void setCardFaceIntf(Integer cardFaceIntf) {
        this.cardFaceIntf = cardFaceIntf;
    }

    public Integer getRecDoubleValue() {
        return recDoubleValue;
    }

    public void setRecDoubleValue(Integer recDoubleValue) {
        this.recDoubleValue = recDoubleValue;
    }

    public Integer getCardFaceScore() {
        return cardFaceScore;
    }

    public void setCardFaceScore(Integer cardFaceScore) {
        this.cardFaceScore = cardFaceScore;
    }

    public Integer getRecModeCardHardware() {
        return recModeCardHardware;
    }

    public void setRecModeCardHardware(Integer recModeCardHardware) {
        this.recModeCardHardware = recModeCardHardware;
    }

    public Integer getCardHardware() {
        return cardHardware;
    }

    public void setCardHardware(Integer cardHardware) {
        this.cardHardware = cardHardware;
    }

    public Integer getRecModeCardIntf() {
        return recModeCardIntf;
    }

    public void setRecModeCardIntf(Integer recModeCardIntf) {
        this.recModeCardIntf = recModeCardIntf;
    }

    public Integer getCardInf() {
        return cardInf;
    }

    public void setCardInf(Integer cardInf) {
        this.cardInf = cardInf;
    }

    public Integer getIdentifyDistance() {
        return identifyDistance;
    }

    public void setIdentifyDistance(Integer identifyDistance) {
        this.identifyDistance = identifyDistance;
    }

    public Integer getComRecDistModeType() {
        return comRecDistModeType;
    }

    public void setComRecDistModeType(Integer comRecDistModeType) {
        this.comRecDistModeType = comRecDistModeType;
    }

    public Integer getRecRank() {
        return recRank;
    }

    public void setRecRank(Integer recRank) {
        this.recRank = recRank;
    }

    public Integer getComRecRank() {
        return comRecRank;
    }

    public void setComRecRank(Integer comRecRank) {
        this.comRecRank = comRecRank;
    }

    public Integer getSaveIdentifyTime() {
        return saveIdentifyTime;
    }

    public void setSaveIdentifyTime(Integer saveIdentifyTime) {
        this.saveIdentifyTime = saveIdentifyTime;
    }

    public Integer getComRecTimeWindow() {
        return comRecTimeWindow;
    }

    public void setComRecTimeWindow(Integer comRecTimeWindow) {
        this.comRecTimeWindow = comRecTimeWindow;
    }

    public Integer getDelayTimeForCloseDoor() {
        return delayTimeForCloseDoor;
    }

    public void setDelayTimeForCloseDoor(Integer delayTimeForCloseDoor) {
        this.delayTimeForCloseDoor = delayTimeForCloseDoor;
    }

    public Integer getComRelayTime() {
        return comRelayTime;
    }

    public void setComRelayTime(Integer comRelayTime) {
        this.comRelayTime = comRelayTime;
    }

    public Integer getMultiplayerDetection() {
        return multiplayerDetection;
    }

    public void setMultiplayerDetection(Integer multiplayerDetection) {
        this.multiplayerDetection = multiplayerDetection;
    }

    public Integer getFaceDetectionType() {
        return faceDetectionType;
    }

    public void setFaceDetectionType(Integer faceDetectionType) {
        this.faceDetectionType = faceDetectionType;
    }

    public Integer getRecModeFaceEnable() {
        return recModeFaceEnable;
    }

    public void setRecModeFaceEnable(Integer recModeFaceEnable) {
        this.recModeFaceEnable = recModeFaceEnable;
    }

    public Integer getFaceEnable() {
        return faceEnable;
    }

    public void setFaceEnable(Integer faceEnable) {
        this.faceEnable = faceEnable;
    }

    public Integer getIdentifyScores() {
        return identifyScores;
    }

    public void setIdentifyScores(Integer identifyScores) {
        this.identifyScores = identifyScores;
    }

    public Integer getFaceScore() {
        return faceScore;
    }

    public void setFaceScore(Integer faceScore) {
        this.faceScore = faceScore;
    }

    public Integer getRecModeIdcardFaceEnable() {
        return recModeIdcardFaceEnable;
    }

    public void setRecModeIdcardFaceEnable(Integer recModeIdcardFaceEnable) {
        this.recModeIdcardFaceEnable = recModeIdcardFaceEnable;
    }

    public Integer getIdCardFaceEnable() {
        return idCardFaceEnable;
    }

    public void setIdCardFaceEnable(Integer idCardFaceEnable) {
        this.idCardFaceEnable = idCardFaceEnable;
    }

    public Integer getRecModeIdcardFaceHardware() {
        return recModeIdcardFaceHardware;
    }

    public void setRecModeIdcardFaceHardware(Integer recModeIdcardFaceHardware) {
        this.recModeIdcardFaceHardware = recModeIdcardFaceHardware;
    }

    public Integer getIdCardFaceHardware() {
        return idCardFaceHardware;
    }

    public void setIdCardFaceHardware(Integer idCardFaceHardware) {
        this.idCardFaceHardware = idCardFaceHardware;
    }

    public Integer getRecModeIdcardFaceIntf() {
        return recModeIdcardFaceIntf;
    }

    public void setRecModeIdcardFaceIntf(Integer recModeIdcardFaceIntf) {
        this.recModeIdcardFaceIntf = recModeIdcardFaceIntf;
    }

    public Integer getIdCardFaceIntf() {
        return idCardFaceIntf;
    }

    public void setIdCardFaceIntf(Integer idCardFaceIntf) {
        this.idCardFaceIntf = idCardFaceIntf;
    }

    public Integer getRecCardFaceValue() {
        return recCardFaceValue;
    }

    public void setRecCardFaceValue(Integer recCardFaceValue) {
        this.recCardFaceValue = recCardFaceValue;
    }

    public Integer getIdCardFaceScore() {
        return idCardFaceScore;
    }

    public void setIdCardFaceScore(Integer idCardFaceScore) {
        this.idCardFaceScore = idCardFaceScore;
    }

    public Integer getShowDeviceKey() {
        return showDeviceKey;
    }

    public void setShowDeviceKey(Integer showDeviceKey) {
        this.showDeviceKey = showDeviceKey;
    }

    public Integer getIsShowDeviceKey() {
        return isShowDeviceKey;
    }

    public void setIsShowDeviceKey(Integer isShowDeviceKey) {
        this.isShowDeviceKey = isShowDeviceKey;
    }

    public Integer getShowIp() {
        return showIp;
    }

    public void setShowIp(Integer showIp) {
        this.showIp = showIp;
    }

    public Integer getIsShowIP() {
        return isShowIP;
    }

    public void setIsShowIP(Integer isShowIP) {
        this.isShowIP = isShowIP;
    }

    public Integer getShowPeopleNum() {
        return showPeopleNum;
    }

    public void setShowPeopleNum(Integer showPeopleNum) {
        this.showPeopleNum = showPeopleNum;
    }

    public Integer getIsShowPersonCount() {
        return isShowPersonCount;
    }

    public void setIsShowPersonCount(Integer isShowPersonCount) {
        this.isShowPersonCount = isShowPersonCount;
    }

    public String getSerialOutContent() {
        return serialOutContent;
    }

    public void setSerialOutContent(String serialOutContent) {
        this.serialOutContent = serialOutContent;
    }

    public String getRecFailComModeContent() {
        return recFailComModeContent;
    }

    public void setRecFailComModeContent(String recFailComModeContent) {
        this.recFailComModeContent = recFailComModeContent;
    }

    public Integer getSerialOutMode() {
        return serialOutMode;
    }

    public void setSerialOutMode(Integer serialOutMode) {
        this.serialOutMode = serialOutMode;
    }

    public Integer getRecFailComModeType() {
        return recFailComModeType;
    }

    public void setRecFailComModeType(Integer recFailComModeType) {
        this.recFailComModeType = recFailComModeType;
    }

    public String getDisplayModStrangerContent() {
        return displayModStrangerContent;
    }

    public void setDisplayModStrangerContent(String displayModStrangerContent) {
        this.displayModStrangerContent = displayModStrangerContent;
    }

    public String getRecFailDisplayTextContent() {
        return recFailDisplayTextContent;
    }

    public void setRecFailDisplayTextContent(String recFailDisplayTextContent) {
        this.recFailDisplayTextContent = recFailDisplayTextContent;
    }

    public Integer getDisplayModStrangerType() {
        return displayModStrangerType;
    }

    public void setDisplayModStrangerType(Integer displayModStrangerType) {
        this.displayModStrangerType = displayModStrangerType;
    }

    public Integer getRecFailDisplayTextType() {
        return recFailDisplayTextType;
    }

    public void setRecFailDisplayTextType(Integer recFailDisplayTextType) {
        this.recFailDisplayTextType = recFailDisplayTextType;
    }

    public Integer getRecStrangerType() {
        return recStrangerType;
    }

    public void setRecStrangerType(Integer recStrangerType) {
        this.recStrangerType = recStrangerType;
    }

    public Integer getRecFailEnable() {
        return recFailEnable;
    }

    public void setRecFailEnable(Integer recFailEnable) {
        this.recFailEnable = recFailEnable;
    }

    public Integer getRelaySwitch() {
        return relaySwitch;
    }

    public void setRelaySwitch(Integer relaySwitch) {
        this.relaySwitch = relaySwitch;
    }

    public Integer getRecFailRelayType() {
        return recFailRelayType;
    }

    public void setRecFailRelayType(Integer recFailRelayType) {
        this.recFailRelayType = recFailRelayType;
    }

    public Integer getRecStrangerTimesThreshold() {
        return recStrangerTimesThreshold;
    }

    public void setRecStrangerTimesThreshold(Integer recStrangerTimesThreshold) {
        this.recStrangerTimesThreshold = recStrangerTimesThreshold;
    }

    public Integer getRecFailTimesThreshold() {
        return recFailTimesThreshold;
    }

    public void setRecFailTimesThreshold(Integer recFailTimesThreshold) {
        this.recFailTimesThreshold = recFailTimesThreshold;
    }

    public String getTtsModStrangerContent() {
        return ttsModStrangerContent;
    }

    public void setTtsModStrangerContent(String ttsModStrangerContent) {
        this.ttsModStrangerContent = ttsModStrangerContent;
    }

    public String getRecFailTtsModeContent() {
        return recFailTtsModeContent;
    }

    public void setRecFailTtsModeContent(String recFailTtsModeContent) {
        this.recFailTtsModeContent = recFailTtsModeContent;
    }

    public Integer getTtsModStrangerType() {
        return ttsModStrangerType;
    }

    public void setTtsModStrangerType(Integer ttsModStrangerType) {
        this.ttsModStrangerType = ttsModStrangerType;
    }

    public Integer getRecFailTtsModeType() {
        return recFailTtsModeType;
    }

    public void setRecFailTtsModeType(Integer recFailTtsModeType) {
        this.recFailTtsModeType = recFailTtsModeType;
    }

    public String getWeigenContent() {
        return weigenContent;
    }

    public void setWeigenContent(String weigenContent) {
        this.weigenContent = weigenContent;
    }

    public String getRecFailWiegandContent() {
        return recFailWiegandContent;
    }

    public void setRecFailWiegandContent(String recFailWiegandContent) {
        this.recFailWiegandContent = recFailWiegandContent;
    }

    public Integer getRecFailWiegandType() {
        return recFailWiegandType;
    }

    public void setRecFailWiegandType(Integer recFailWiegandType) {
        this.recFailWiegandType = recFailWiegandType;
    }

    public String getRecNoPerComModeContent() {
        return recNoPerComModeContent;
    }

    public void setRecNoPerComModeContent(String recNoPerComModeContent) {
        this.recNoPerComModeContent = recNoPerComModeContent;
    }

    public Integer getRecNoPerComModeType() {
        return recNoPerComModeType;
    }

    public void setRecNoPerComModeType(Integer recNoPerComModeType) {
        this.recNoPerComModeType = recNoPerComModeType;
    }

    public String getRecNoPerDisplayText1Content() {
        return recNoPerDisplayText1Content;
    }

    public void setRecNoPerDisplayText1Content(String recNoPerDisplayText1Content) {
        this.recNoPerDisplayText1Content = recNoPerDisplayText1Content;
    }

    public Integer getRecNoPerDisplayText1Type() {
        return recNoPerDisplayText1Type;
    }

    public void setRecNoPerDisplayText1Type(Integer recNoPerDisplayText1Type) {
        this.recNoPerDisplayText1Type = recNoPerDisplayText1Type;
    }

    public String getRecNoPerDisplayText2Content() {
        return recNoPerDisplayText2Content;
    }

    public void setRecNoPerDisplayText2Content(String recNoPerDisplayText2Content) {
        this.recNoPerDisplayText2Content = recNoPerDisplayText2Content;
    }

    public Integer getRecNoPerDisplayText2Type() {
        return recNoPerDisplayText2Type;
    }

    public void setRecNoPerDisplayText2Type(Integer recNoPerDisplayText2Type) {
        this.recNoPerDisplayText2Type = recNoPerDisplayText2Type;
    }

    public Integer getRecNoPerRelayType() {
        return recNoPerRelayType;
    }

    public void setRecNoPerRelayType(Integer recNoPerRelayType) {
        this.recNoPerRelayType = recNoPerRelayType;
    }

    public String getRecNoPerTtsModeContent() {
        return recNoPerTtsModeContent;
    }

    public void setRecNoPerTtsModeContent(String recNoPerTtsModeContent) {
        this.recNoPerTtsModeContent = recNoPerTtsModeContent;
    }

    public Integer getRecNoPerTtsModeType() {
        return recNoPerTtsModeType;
    }

    public void setRecNoPerTtsModeType(Integer recNoPerTtsModeType) {
        this.recNoPerTtsModeType = recNoPerTtsModeType;
    }

    public String getRecNoPerWiegandContent() {
        return recNoPerWiegandContent;
    }

    public void setRecNoPerWiegandContent(String recNoPerWiegandContent) {
        this.recNoPerWiegandContent = recNoPerWiegandContent;
    }

    public Integer getRecNoPerWiegandType() {
        return recNoPerWiegandType;
    }

    public void setRecNoPerWiegandType(Integer recNoPerWiegandType) {
        this.recNoPerWiegandType = recNoPerWiegandType;
    }

    public String getComModContent() {
        return comModContent;
    }

    public void setComModContent(String comModContent) {
        this.comModContent = comModContent;
    }

    public String getRecSucComModeContent() {
        return recSucComModeContent;
    }

    public void setRecSucComModeContent(String recSucComModeContent) {
        this.recSucComModeContent = recSucComModeContent;
    }

    public Integer getComModType() {
        return comModType;
    }

    public void setComModType(Integer comModType) {
        this.comModType = comModType;
    }

    public Integer getRecSucComModeType() {
        return recSucComModeType;
    }

    public void setRecSucComModeType(Integer recSucComModeType) {
        this.recSucComModeType = recSucComModeType;
    }

    public String getDisplayModContent() {
        return displayModContent;
    }

    public void setDisplayModContent(String displayModContent) {
        this.displayModContent = displayModContent;
    }

    public String getRecSucDisplayText1Content() {
        return recSucDisplayText1Content;
    }

    public void setRecSucDisplayText1Content(String recSucDisplayText1Content) {
        this.recSucDisplayText1Content = recSucDisplayText1Content;
    }

    public Integer getDisplayModType() {
        return displayModType;
    }

    public void setDisplayModType(Integer displayModType) {
        this.displayModType = displayModType;
    }

    public Integer getRecSucDisplayText1Type() {
        return recSucDisplayText1Type;
    }

    public void setRecSucDisplayText1Type(Integer recSucDisplayText1Type) {
        this.recSucDisplayText1Type = recSucDisplayText1Type;
    }

    public String getRecSucDisplayText2Content() {
        return recSucDisplayText2Content;
    }

    public void setRecSucDisplayText2Content(String recSucDisplayText2Content) {
        this.recSucDisplayText2Content = recSucDisplayText2Content;
    }

    public Integer getRecSucDisplayText2Type() {
        return recSucDisplayText2Type;
    }

    public void setRecSucDisplayText2Type(Integer recSucDisplayText2Type) {
        this.recSucDisplayText2Type = recSucDisplayText2Type;
    }

    public Integer getIsOpenRelay() {
        return isOpenRelay;
    }

    public void setIsOpenRelay(Integer isOpenRelay) {
        this.isOpenRelay = isOpenRelay;
    }

    public Integer getRecSucRelayType() {
        return recSucRelayType;
    }

    public void setRecSucRelayType(Integer recSucRelayType) {
        this.recSucRelayType = recSucRelayType;
    }

    public Integer getTtsModType() {
        return ttsModType;
    }

    public void setTtsModType(Integer ttsModType) {
        this.ttsModType = ttsModType;
    }

    public Integer getRecSucTtsModeType() {
        return recSucTtsModeType;
    }

    public void setRecSucTtsModeType(Integer recSucTtsModeType) {
        this.recSucTtsModeType = recSucTtsModeType;
    }

    public String getTtsModContent() {
        return ttsModContent;
    }

    public void setTtsModContent(String ttsModContent) {
        this.ttsModContent = ttsModContent;
    }

    public String getRecSucTtsModeContent() {
        return recSucTtsModeContent;
    }

    public void setRecSucTtsModeContent(String recSucTtsModeContent) {
        this.recSucTtsModeContent = recSucTtsModeContent;
    }

    public String getWg() {
        return wg;
    }

    public void setWg(String wg) {
        this.wg = wg;
    }

    public String getRecSucWiegandContent() {
        return recSucWiegandContent;
    }

    public void setRecSucWiegandContent(String recSucWiegandContent) {
        this.recSucWiegandContent = recSucWiegandContent;
    }

    public Integer getRecSucWiegandType() {
        return recSucWiegandType;
    }

    public void setRecSucWiegandType(Integer recSucWiegandType) {
        this.recSucWiegandType = recSucWiegandType;
    }

    public String getScrDisplayText1Content() {
        return scrDisplayText1Content;
    }

    public void setScrDisplayText1Content(String scrDisplayText1Content) {
        this.scrDisplayText1Content = scrDisplayText1Content;
    }

    public Integer getScrDisplayText1Type() {
        return scrDisplayText1Type;
    }

    public void setScrDisplayText1Type(Integer scrDisplayText1Type) {
        this.scrDisplayText1Type = scrDisplayText1Type;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getScrDisplayText2Content() {
        return scrDisplayText2Content;
    }

    public void setScrDisplayText2Content(String scrDisplayText2Content) {
        this.scrDisplayText2Content = scrDisplayText2Content;
    }

    public Integer getScrDisplayText2Type() {
        return scrDisplayText2Type;
    }

    public void setScrDisplayText2Type(Integer scrDisplayText2Type) {
        this.scrDisplayText2Type = scrDisplayText2Type;
    }

    public Integer getOrientation() {
        return orientation;
    }

    public void setOrientation(Integer orientation) {
        this.orientation = orientation;
    }

    public Integer getScrOrntType() {
        return scrOrntType;
    }

    public void setScrOrntType(Integer scrOrntType) {
        this.scrOrntType = scrOrntType;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(Integer whitelist) {
        this.whitelist = whitelist;
    }

    public Integer getRecModeCardPhoto() {
        return recModeCardPhoto;
    }

    public void setRecModeCardPhoto(Integer recModeCardPhoto) {
        this.recModeCardPhoto = recModeCardPhoto;
    }

    public String getScrImage1Url() {
        return scrImage1Url;
    }

    public void setScrImage1Url(String scrImage1Url) {
        this.scrImage1Url = scrImage1Url;
    }

    public String getScrImage2Url() {
        return scrImage2Url;
    }

    public void setScrImage2Url(String scrImage2Url) {
        this.scrImage2Url = scrImage2Url;
    }

    public String getScrDisableUrl() {
        return scrDisableUrl;
    }

    public void setScrDisableUrl(String scrDisableUrl) {
        this.scrDisableUrl = scrDisableUrl;
    }

    public String getBigScrUrl() {
        return bigScrUrl;
    }

    public void setBigScrUrl(String bigScrUrl) {
        this.bigScrUrl = bigScrUrl;
    }

    public Integer getScreenMode() {
        return screenMode;
    }

    public void setScreenMode(Integer screenMode) {
        this.screenMode = screenMode;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    @Override
    public String toString() {
        return "UpdateDeviceConfigRequest{" + "recModeCardEnable=" + recModeCardEnable + ", cardEnable=" + cardEnable
                + ", recModeCardFaceEnable=" + recModeCardFaceEnable + ", cardFaceEnable=" + cardFaceEnable
                + ", recModeCardFaceHardware=" + recModeCardFaceHardware + ", cardFaceHardware=" + cardFaceHardware
                + ", recModeCardFaceIntf=" + recModeCardFaceIntf + ", cardFaceIntf=" + cardFaceIntf
                + ", recDoubleValue=" + recDoubleValue + ", cardFaceScore=" + cardFaceScore + ", recModeCardHardware="
                + recModeCardHardware + ", cardHardware=" + cardHardware + ", recModeCardIntf=" + recModeCardIntf
                + ", cardInf=" + cardInf + ", identifyDistance=" + identifyDistance + ", comRecDistModeType="
                + comRecDistModeType + ", recRank=" + recRank + ", comRecRank=" + comRecRank + ", saveIdentifyTime="
                + saveIdentifyTime + ", comRecTimeWindow=" + comRecTimeWindow + ", delayTimeForCloseDoor="
                + delayTimeForCloseDoor + ", comRelayTime=" + comRelayTime + ", multiplayerDetection="
                + multiplayerDetection + ", faceDetectionType=" + faceDetectionType + ", recModeFaceEnable="
                + recModeFaceEnable + ", faceEnable=" + faceEnable + ", identifyScores=" + identifyScores
                + ", faceScore=" + faceScore + ", recModeIdcardFaceEnable=" + recModeIdcardFaceEnable
                + ", idCardFaceEnable=" + idCardFaceEnable + ", recModeIdcardFaceHardware=" + recModeIdcardFaceHardware
                + ", idCardFaceHardware=" + idCardFaceHardware + ", recModeIdcardFaceIntf=" + recModeIdcardFaceIntf
                + ", idCardFaceIntf=" + idCardFaceIntf + ", recCardFaceValue=" + recCardFaceValue + ", idCardFaceScore="
                + idCardFaceScore + ", showDeviceKey=" + showDeviceKey + ", isShowDeviceKey=" + isShowDeviceKey
                + ", showIp=" + showIp + ", isShowIP=" + isShowIP + ", showPeopleNum=" + showPeopleNum
                + ", isShowPersonCount=" + isShowPersonCount + ", serialOutContent='" + serialOutContent + '\''
                + ", recFailComModeContent='" + recFailComModeContent + '\'' + ", serialOutMode=" + serialOutMode
                + ", recFailComModeType=" + recFailComModeType + ", displayModStrangerContent='"
                + displayModStrangerContent + '\'' + ", recFailDisplayTextContent='" + recFailDisplayTextContent + '\''
                + ", displayModStrangerType=" + displayModStrangerType + ", recFailDisplayTextType="
                + recFailDisplayTextType + ", recStrangerType=" + recStrangerType + ", recFailEnable=" + recFailEnable
                + ", relaySwitch=" + relaySwitch + ", recFailRelayType=" + recFailRelayType
                + ", recStrangerTimesThreshold=" + recStrangerTimesThreshold + ", recFailTimesThreshold="
                + recFailTimesThreshold + ", ttsModStrangerContent='" + ttsModStrangerContent + '\''
                + ", recFailTtsModeContent='" + recFailTtsModeContent + '\'' + ", ttsModStrangerType="
                + ttsModStrangerType + ", recFailTtsModeType=" + recFailTtsModeType + ", weigenContent='"
                + weigenContent + '\'' + ", recFailWiegandContent='" + recFailWiegandContent + '\''
                + ", recFailWiegandType=" + recFailWiegandType + ", recNoPerComModeContent='" + recNoPerComModeContent
                + '\'' + ", recNoPerComModeType=" + recNoPerComModeType + ", recNoPerDisplayText1Content='"
                + recNoPerDisplayText1Content + '\'' + ", recNoPerDisplayText1Type=" + recNoPerDisplayText1Type
                + ", recNoPerDisplayText2Content='" + recNoPerDisplayText2Content + '\'' + ", recNoPerDisplayText2Type="
                + recNoPerDisplayText2Type + ", recNoPerRelayType=" + recNoPerRelayType + ", recNoPerTtsModeContent='"
                + recNoPerTtsModeContent + '\'' + ", recNoPerTtsModeType=" + recNoPerTtsModeType
                + ", recNoPerWiegandContent='" + recNoPerWiegandContent + '\'' + ", recNoPerWiegandType="
                + recNoPerWiegandType + ", comModContent='" + comModContent + '\'' + ", recSucComModeContent='"
                + recSucComModeContent + '\'' + ", comModType=" + comModType + ", recSucComModeType="
                + recSucComModeType + ", displayModContent='" + displayModContent + '\''
                + ", recSucDisplayText1Content='" + recSucDisplayText1Content + '\'' + ", displayModType="
                + displayModType + ", recSucDisplayText1Type=" + recSucDisplayText1Type
                + ", recSucDisplayText2Content='" + recSucDisplayText2Content + '\'' + ", recSucDisplayText2Type="
                + recSucDisplayText2Type + ", isOpenRelay=" + isOpenRelay + ", recSucRelayType=" + recSucRelayType
                + ", ttsModType=" + ttsModType + ", recSucTtsModeType=" + recSucTtsModeType + ", ttsModContent='"
                + ttsModContent + '\'' + ", recSucTtsModeContent='" + recSucTtsModeContent + '\'' + ", wg='" + wg + '\''
                + ", recSucWiegandContent='" + recSucWiegandContent + '\'' + ", recSucWiegandType=" + recSucWiegandType
                + ", scrDisplayText1Content='" + scrDisplayText1Content + '\'' + ", scrDisplayText1Type="
                + scrDisplayText1Type + ", companyName='" + companyName + '\'' + ", scrDisplayText2Content='"
                + scrDisplayText2Content + '\'' + ", scrDisplayText2Type=" + scrDisplayText2Type + ", orientation="
                + orientation + ", scrOrntType=" + scrOrntType + ", slogan='" + slogan + '\'' + ", intro='" + intro
                + '\'' + ", whitelist=" + whitelist + ", recModeCardPhoto=" + recModeCardPhoto + ", scrImage1Url='"
                + scrImage1Url + '\'' + ", scrImage2Url='" + scrImage2Url + '\'' + ", scrDisableUrl='" + scrDisableUrl
                + '\'' + ", bigScrUrl='" + bigScrUrl + '\'' + ", screenMode=" + screenMode + ", applicationName='"
                + applicationName + '\'' + '}';
    }

}
