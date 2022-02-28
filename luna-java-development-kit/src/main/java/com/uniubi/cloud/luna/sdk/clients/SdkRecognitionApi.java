package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.models.SDKPageInfo;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;
import com.uniubi.cloud.luna.sdk.common.models.request.QueryRecognitionPageRequest;
import com.uniubi.cloud.luna.sdk.common.models.response.RecognitionResponseModel;

/**
 * com.uniubi.medusa.ares.develop.api.clients.SdkRecognitionApi
 *
 * @author jingmu
 * @since 2020/5/18
 */
public interface SdkRecognitionApi {

    @RequestMark(name = "queryRecognitionPage", desc = "分页查询识别记录")
    SdkResult<SDKPageInfo<RecognitionResponseModel>> queryRecognitionPage(
            QueryRecognitionPageRequest queryRecognitionPageRequest);

}
