package com.uniubi.cloud.luna.sdk.common.type;

/**
 * com.uniubi.cloud.funx.type.ShortTypeHandler
 *
 * @author jingmu
 * @since 2020/3/20
 */
public class ShortTypeHandler implements TypeHandler<Short> {

    @Override
    public Short get(String str) {
        return Short.parseShort(str);
    }

}
