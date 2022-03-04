package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.annotation.RequestParam;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;
import com.uniubi.cloud.luna.sdk.common.models.request.AddPersonRoleRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.UpdatePersonRoleRequest;
import com.uniubi.cloud.luna.sdk.common.models.response.PersonRoleResponseModel;

import java.util.List;

/**
 * Person Role(Position) API
 * <p>
 * 职称API
 *
 * @author jingmu
 * @since 2020/5/18
 */
public interface SdkPersonRoleApi {

    /**
     * add role(position)
     * @param addPersonRoleRequest the request parameter
     * @return the new role id
     */
    @RequestMark(name = "addPersonRole", desc = "添加职称")
    SdkResult<String> addPersonRole(AddPersonRoleRequest addPersonRoleRequest);

    /**
     * delete role
     * @param personRoleId the role id
     * @return void
     */
    @RequestMark(name = "deletePersonRole", desc = "删除职称")
    SdkResult<Void> deletePersonRole(@RequestParam("personRoleId") String personRoleId);

    /**
     * update role
     * @param updatePersonRoleRequest the request parameter
     * @return void
     */
    @RequestMark(name = "updatePersonRole", desc = "更新职称")
    SdkResult<Void> updatePersonRole(UpdatePersonRoleRequest updatePersonRoleRequest);

    /**
     * list all person roles
     * @return the person role list.
     */
    @RequestMark(name = "listAllPersonRoles", desc = "获取所有人员职称")
    SdkResult<List<PersonRoleResponseModel>> listAllPersonRoles();

}
