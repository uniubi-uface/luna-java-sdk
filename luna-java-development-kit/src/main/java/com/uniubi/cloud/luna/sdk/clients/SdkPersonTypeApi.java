package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.annotation.RequestParam;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;
import com.uniubi.cloud.luna.sdk.common.models.request.AddPersonTypeRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.UpdatePersonTypeRequest;
import com.uniubi.cloud.luna.sdk.common.models.response.PersonTypeResponseModel;

import java.util.List;

/**
 * <p class="detail">
 * 功能:
 * </p>
 *
 * @author huangHuizhou ClassName Sdk person type api.
 * @version V1.0.
 * @since 2020.10.14 09:50:53
 */
public interface SdkPersonTypeApi {

    /**
     * <p class="detail">
     * 功能:
     * </p>
     * @param addPersonTypeRequest :
     * @return sdk result
     * @author huanghuizhou
     * @since 2020.10.14 09:50:53
     */
    @RequestMark(name = "addPersonType", desc = "添加人员类型")
    SdkResult<String> addPersonType(AddPersonTypeRequest addPersonTypeRequest);

    /**
     * <p class="detail">
     * 功能:
     * </p>
     * @param personTypeId :
     * @return sdk result
     * @author huanghuizhou
     * @since 2020.10.14 09:50:53
     */
    @RequestMark(name = "deletePersonType", desc = "删除人员类型")
    SdkResult<Void> deletePersonType(@RequestParam("personTypeId") String personTypeId);

    /**
     * <p class="detail">
     * 功能:
     * </p>
     * @param updatePersonTypeRequest :
     * @return sdk result
     * @author huanghuizhou
     * @since 2020.10.14 09:50:53
     */
    @RequestMark(name = "updatePersonType", desc = "更新人员类型")
    SdkResult<Void> updatePersonType(UpdatePersonTypeRequest updatePersonTypeRequest);

    /**
     * <p class="detail">
     * 功能:
     * </p>
     * @return sdk result
     * @author huanghuizhou
     * @since 2020.10.14 09:50:53
     */
    @RequestMark(name = "listAllPersonTypes", desc = "获取所有人员类型")
    SdkResult<List<PersonTypeResponseModel>> listAllPersonTypes();

}
