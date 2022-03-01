package com.uniubi.cloud.luna.sdk.common;

/**
 * sdk语言
 *
 * @author jingmu
 * @since 2020/5/8
 */
public enum SdkLang {

    /**
     * 简体中文
     */
    CN("zh_CN"),
    /**
     * English
     */
    EN("en"),
    /**
     * 俄罗斯
     */
    RU("ru"),
    /**
     * 法语
     */
    FR("fr"),
    /**
     * 西班牙
     */
    ES("es"),;

    private final String value;

    SdkLang(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
