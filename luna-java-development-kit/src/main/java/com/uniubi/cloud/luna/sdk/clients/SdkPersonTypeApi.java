package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.annotation.RequestParam;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;
import com.uniubi.cloud.luna.sdk.common.models.request.AddPersonTypeRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.UpdatePersonTypeRequest;
import com.uniubi.cloud.luna.sdk.common.models.response.PersonTypeResponseModel;

import java.util.List;

/**
 * Person Type API
 * @author jingmu
 * @version V1.0.
 * @since 2020.10.14 09:50:53
 */
public interface SdkPersonTypeApi {

    /**
     * add person type
     * @param addPersonTypeRequest the request parameter
     * @return the person id
     */
    @RequestMark(name = "addPersonType", desc = "添加人员类型")
    SdkResult<String> addPersonType(AddPersonTypeRequest addPersonTypeRequest);

    /**
     * delete person type
     * @param personTypeId the person type id
     * @return sdk result
     */
    @RequestMark(name = "deletePersonType", desc = "删除人员类型")
    SdkResult<Void> deletePersonType(@RequestParam("personTypeId") String personTypeId);

    /**
     * update person type
     * @param updatePersonTypeRequest the request parameter
     * @return sdk result
     */
    @RequestMark(name = "updatePersonType", desc = "更新人员类型")
    SdkResult<Void> updatePersonType(UpdatePersonTypeRequest updatePersonTypeRequest);

    /**
     * list all person type.
     * @return the person type list.
     */
    @RequestMark(name = "listAllPersonTypes", desc = "获取所有人员类型")
    SdkResult<List<PersonTypeResponseModel>> listAllPersonTypes();

}
