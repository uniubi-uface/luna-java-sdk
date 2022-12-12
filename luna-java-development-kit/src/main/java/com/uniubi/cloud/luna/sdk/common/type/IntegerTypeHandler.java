package com.uniubi.cloud.luna.sdk.common.type;

/**
 * com.uniubi.cloud.funx.type.IntegerTypeHandler
 * @author jingmu
 * @since 2020/3/20
 */
public class IntegerTypeHandler implements TypeHandler<Integer> {

    @Override
    public Integer get(String str) {
        return Integer.parseInt(str);
    }

}
