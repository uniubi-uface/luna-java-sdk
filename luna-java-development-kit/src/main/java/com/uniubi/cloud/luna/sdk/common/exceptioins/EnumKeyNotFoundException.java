package com.uniubi.cloud.luna.sdk.common.exceptioins;

import java.text.MessageFormat;

/**
 * @author jingmu
 */
public class EnumKeyNotFoundException extends RuntimeException {

    public EnumKeyNotFoundException(Class enumType, String key) {
        super(MessageFormat.format("找不到枚举类型 {0} 的key值：{1}", enumType.getName(), key));
    }

}