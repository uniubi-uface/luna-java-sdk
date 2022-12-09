package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.annotation.RequestParam;
import com.uniubi.cloud.luna.sdk.common.models.SDKPageInfo;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;
import com.uniubi.cloud.luna.sdk.common.models.request.AddPersonRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.GenerateEmpQrCodeRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.QueryPersonPageRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.UpdatePersonRequest;
import com.uniubi.cloud.luna.sdk.common.models.response.AresEmpQrCodeModel;
import com.uniubi.cloud.luna.sdk.common.models.response.PersonResponseModel;

/**
 * 人员接口
 * <p>
 * Person(Employee) API
 * @author jingmu
 * @since 2020/5/7
 */
public interface SdkPersonApi {

    /**
     * add person
     * @param addPersonRequest the request parameter
     * @return the new person ID(data ID).
     */
    @RequestMark(name = "addPerson", desc = "添加人员")
    SdkResult<String> addPerson(AddPersonRequest addPersonRequest);

    /**
     * update person
     * @param updatePersonRequest the request parameter
     * @return void
     */
    @RequestMark(name = "updatePerson", desc = "更新人员")
    SdkResult<Void> updatePerson(UpdatePersonRequest updatePersonRequest);

    /**
     * delete person
     * @param empId the employee ID which get from
     * {@link SdkPersonApi#addPerson(AddPersonRequest)}
     * @return void
     */
    @RequestMark(name = "deletePerson", desc = "删除人员")
    SdkResult<Void> deletePerson(@RequestParam("empId") String empId);

    /**
     * paging query employee
     * @param queryPersonPageRequest the request parameter
     * @return PersonResponseModel
     */
    @RequestMark(name = "queryPersonPage", desc = "查询人员分页")
    SdkResult<SDKPageInfo<PersonResponseModel>> queryPersonPage(QueryPersonPageRequest queryPersonPageRequest);

    /**
     * 生成人员二维码
     */
    @RequestMark(name = "generateEmpQrCode", desc = "生成人员二维码")
    SdkResult<AresEmpQrCodeModel> generateEmpQrCode(GenerateEmpQrCodeRequest request);
}
