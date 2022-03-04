package com.uniubi.cloud.luna.sdk.common.type;

/**
 * com.uniubi.cloud.funx.type.FloatTypeHandler
 * @author jingmu
 * @since 2020/3/20
 */
public class FloatTypeHandler implements TypeHandler<Float> {

    @Override
    public Float get(String str) {
        return Float.parseFloat(str);
    }

}
