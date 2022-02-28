package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.annotation.RequestParam;
import com.uniubi.cloud.luna.sdk.common.models.SDKResult;
import com.uniubi.cloud.luna.sdk.common.models.response.FileResponseModel;

/**
 * com.uniubi.medusa.ares.develop.api.clients.SdkFileApi
 *
 * @author jingmu
 * @since 2020/5/18
 */
public interface SdkFileApi {

    @RequestMark(name = "getImage", desc = "获取图片")
    SDKResult<FileResponseModel> getImage(@RequestParam("imageId") String imageId);

    @RequestMark(name = "getPersonFace", desc = "获取人像")
    SDKResult<FileResponseModel> getPersonFace(@RequestParam("faceId") String faceId);

}