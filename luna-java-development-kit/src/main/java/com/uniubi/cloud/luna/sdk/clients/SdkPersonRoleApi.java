package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.annotation.RequestParam;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;
import com.uniubi.cloud.luna.sdk.common.models.request.AddPersonRoleRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.UpdatePersonRoleRequest;
import com.uniubi.cloud.luna.sdk.common.models.response.PersonRoleResponseModel;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.api.clients.SdkPersonRoleApi
 *
 * @author jingmu
 * @since 2020/5/18
 */
public interface SdkPersonRoleApi {

    @RequestMark(name = "addPersonRole", desc = "添加职称")
    SdkResult<String> addPersonRole(AddPersonRoleRequest addPersonRoleRequest);

    @RequestMark(name = "deletePersonRole", desc = "删除职称")
    SdkResult<Void> deletePersonRole(@RequestParam("personRoleId") String personRoleId);

    @RequestMark(name = "updatePersonRole", desc = "更新职称")
    SdkResult<Void> updatePersonRole(UpdatePersonRoleRequest updatePersonRoleRequest);

    @RequestMark(name = "listAllPersonRoles", desc = "获取所有人员职称")
    SdkResult<List<PersonRoleResponseModel>> listAllPersonRoles();

}
