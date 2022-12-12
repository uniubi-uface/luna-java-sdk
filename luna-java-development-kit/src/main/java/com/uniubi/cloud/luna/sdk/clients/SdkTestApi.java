package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;

/**
 * 测试api接口
 * <p>
 * Test API
 * @author jingmu
 * @since 2020/5/8
 */
public interface SdkTestApi {

    /**
     * the test api
     * @return the result is a simple string.
     */
    @RequestMark(name = "test", desc = "测试接口")
    SdkResult<String> test();

}
