package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.annotation.RequestParam;
import com.uniubi.cloud.luna.sdk.common.models.SDKPageInfo;
import com.uniubi.cloud.luna.sdk.common.models.SDKResult;
import com.uniubi.cloud.luna.sdk.common.models.request.AddPersonRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.QueryPersonPageRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.UpdatePersonRequest;
import com.uniubi.cloud.luna.sdk.common.models.response.PersonResponseModel;

/**
 * 人员接口
 *
 * @author jingmu
 * @since 2020/5/7
 */
public interface SdkPersonApi {

    @RequestMark(name = "addPerson", desc = "添加人员")
    SDKResult<String> addPerson(AddPersonRequest addPersonRequest);

    @RequestMark(name = "updatePerson", desc = "更新人员")
    SDKResult<Void> updatePerson(UpdatePersonRequest updatePersonRequest);

    @RequestMark(name = "deletePerson", desc = "删除人员")
    SDKResult<Void> deletePerson(@RequestParam("empId") String empId);

    @RequestMark(name = "queryPersonPage", desc = "查询人员分页")
    SDKResult<SDKPageInfo<PersonResponseModel>> queryPersonPage(QueryPersonPageRequest queryPersonPageRequest);

}