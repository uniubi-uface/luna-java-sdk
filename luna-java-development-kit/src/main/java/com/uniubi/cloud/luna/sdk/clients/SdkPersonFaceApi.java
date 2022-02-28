package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.models.SDKResult;
import com.uniubi.cloud.luna.sdk.common.models.request.AddPersonFaceRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.DeletePersonFaceRequest;

/**
 * com.uniubi.medusa.ares.develop.api.clients.SdkPersonFaceApi
 *
 * @author jingmu
 * @since 2020/6/18
 */
public interface SdkPersonFaceApi {

    @RequestMark(name = "addPersonFace", desc = "添加人员人像")
    SDKResult<String> addPersonFace(AddPersonFaceRequest addPersonFaceRequest);

    @RequestMark(name = "deletePersonFace", desc = "删除人员人像")
    SDKResult<Void> deletePersonFace(DeletePersonFaceRequest deletePersonFaceRequest);

}
