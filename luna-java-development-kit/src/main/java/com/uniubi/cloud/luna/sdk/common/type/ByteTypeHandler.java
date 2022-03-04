package com.uniubi.cloud.luna.sdk.common.type;

/**
 * com.uniubi.cloud.funx.type.ByteTypeHandler
 * @author jingmu
 * @since 2020/3/20
 */
public class ByteTypeHandler implements TypeHandler<Byte> {

    @Override
    public Byte get(String str) {
        return Byte.parseByte(str);
    }

}
