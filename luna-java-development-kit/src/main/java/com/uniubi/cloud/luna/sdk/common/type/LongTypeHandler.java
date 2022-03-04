package com.uniubi.cloud.luna.sdk.common.type;

/**
 * com.uniubi.cloud.funx.type.LongTypeHandler
 * @author jingmu
 * @since 2020/3/20
 */
public class LongTypeHandler implements TypeHandler<Long> {

    @Override
    public Long get(String str) {
        return Long.parseLong(str);
    }

}
