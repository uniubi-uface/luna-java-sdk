package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.models.request.UpdateDeviceLanguageRequest
 * @author jingmu
 * @since 2020/5/19
 */
public class UpdateDeviceLanguageRequest extends DeviceOperatorBaseRequest {

    /**
     * 设备语言（en(英文) zh-CN(中文) ）
     */
    private String lang;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "UpdateDeviceLanguageRequest{" + "lang='" + lang + '\'' + '}';
    }

}
