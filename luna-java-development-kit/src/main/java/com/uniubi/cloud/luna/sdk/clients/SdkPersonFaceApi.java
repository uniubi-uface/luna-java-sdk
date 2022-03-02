package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;
import com.uniubi.cloud.luna.sdk.common.models.request.AddPersonFaceRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.DeletePersonFaceRequest;

/**
 * Person Face API
 *
 * @author jingmu
 * @since 2020/6/18
 */
public interface SdkPersonFaceApi {

    /**
     * add person face
     * @param addPersonFaceRequest the request parameter
     * @return the face photo id. This is photo id, not face id. Face id is different from
     * photo id.
     */
    @RequestMark(name = "addPersonFace", desc = "添加人员人像")
    SdkResult<String> addPersonFace(AddPersonFaceRequest addPersonFaceRequest);

    /**
     * delete person face
     * @param deletePersonFaceRequest this is photo id, not face id.
     * @return void
     */
    @RequestMark(name = "deletePersonFace", desc = "删除人员人像")
    SdkResult<Void> deletePersonFace(DeletePersonFaceRequest deletePersonFaceRequest);

}
