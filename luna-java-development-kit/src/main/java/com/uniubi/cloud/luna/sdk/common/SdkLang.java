package com.uniubi.cloud.luna.sdk.common;

/**
 * sdk语言
 *
 * @author jingmu
 * @since 2020/5/8
 */
public enum SdkLang {

    /**
     * 中文
     */
    CN("zh_CN"),
    /**
     * 英文
     */
    EN("en"),
    // todo 语种已扩充
    ;

    private final String value;

    SdkLang(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
