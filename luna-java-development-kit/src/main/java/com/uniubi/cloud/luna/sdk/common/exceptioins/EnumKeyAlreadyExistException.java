package com.uniubi.cloud.luna.sdk.common.exceptioins;

import java.text.MessageFormat;

/**
 * @author jingmu
 */
public class EnumKeyAlreadyExistException extends RuntimeException {

    public EnumKeyAlreadyExistException(Class enumType, String key) {
        super(MessageFormat.format("枚举类型 {0} key值重复，重复key为：{1}", enumType.getName(), key));
    }

}