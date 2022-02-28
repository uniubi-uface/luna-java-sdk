package com.uniubi.cloud.luna.sdk.common.type;

/**
 * com.uniubi.cloud.funx.type.TypeHandler
 *
 * @author jingmu
 * @since 2020/3/20
 */
public interface TypeHandler<T> {

    T get(String str);

    default String getString(T t) {
        return String.valueOf(t);
    }

}
