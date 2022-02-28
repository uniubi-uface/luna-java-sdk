package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.annotation.RequestParam;
import com.uniubi.cloud.luna.sdk.common.models.SDKResult;
import com.uniubi.cloud.luna.sdk.common.models.request.AddPersonGroupRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.UpdatePersonGroupRequest;
import com.uniubi.cloud.luna.sdk.common.models.response.PersonGroupResponseModel;

/**
 * com.uniubi.medusa.ares.develop.api.clients.SdkPersonGroupApi
 *
 * @author jingmu
 * @since 2020/5/18
 */
public interface SdkPersonGroupApi {

    @RequestMark(name = "addPersonGroup", desc = "添加人员分组")
    SDKResult<String> addPersonGroup(AddPersonGroupRequest addPersonGroupRequest);

    @RequestMark(name = "updatePersonGroup", desc = "修改人员分组")
    SDKResult<Void> updatePersonGroup(UpdatePersonGroupRequest updatePersonGroupRequest);

    @RequestMark(name = "getPersonGroup", desc = "获取人员分组")
    SDKResult<PersonGroupResponseModel> getPersonGroup(@RequestParam("personGroupId") String personGroupId);

    @RequestMark(name = "deletePersonGroup", desc = "删除人员分组")
    SDKResult<Void> deletePersonGroup(@RequestParam("personGroupId") String personGroupId);

}
