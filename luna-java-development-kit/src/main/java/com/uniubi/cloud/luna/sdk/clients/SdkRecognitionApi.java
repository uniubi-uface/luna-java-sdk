package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.models.SDKPageInfo;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;
import com.uniubi.cloud.luna.sdk.common.models.request.QueryRecognitionPageRequest;
import com.uniubi.cloud.luna.sdk.common.models.response.RecognitionResponseModel;

/**
 * Device Recognition API
 * @author jingmu
 * @since 2020/5/18
 */
public interface SdkRecognitionApi {

    /**
     * paging query device recognition
     * @param queryRecognitionPageRequest the paging query parameter
     * @return the page result
     */
    @RequestMark(name = "queryRecognitionPage", desc = "分页查询识别记录")
    SdkResult<SDKPageInfo<RecognitionResponseModel>> queryRecognitionPage(
            QueryRecognitionPageRequest queryRecognitionPageRequest);

}
