package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.annotation.RequestParam;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;
import com.uniubi.cloud.luna.sdk.common.models.request.AddPersonGroupRequest;
import com.uniubi.cloud.luna.sdk.common.models.request.UpdatePersonGroupRequest;
import com.uniubi.cloud.luna.sdk.common.models.response.PersonGroupResponseModel;

/**
 * Department API
 * <p>
 * 分组（部门） api
 *
 * @author jingmu
 * @since 2020/5/18
 */
public interface SdkPersonGroupApi {

    /**
     * add person department.
     * @param addPersonGroupRequest the request parameter
     * @return the new department id.
     */
    @RequestMark(name = "addPersonGroup", desc = "添加人员分组（部门）")
    SdkResult<String> addPersonGroup(AddPersonGroupRequest addPersonGroupRequest);

    /**
     * update department.
     * @param updatePersonGroupRequest the request parameter
     * @return Void
     */
    @RequestMark(name = "updatePersonGroup", desc = "修改人员分组（部门）")
    SdkResult<Void> updatePersonGroup(UpdatePersonGroupRequest updatePersonGroupRequest);

    /**
     * get the department list
     * @param personGroupId department id
     * @return PersonGroupResponseModel
     */
    @RequestMark(name = "getPersonGroup", desc = "获取人员分组（部门）")
    SdkResult<PersonGroupResponseModel> getPersonGroup(@RequestParam("personGroupId") String personGroupId);

    /**
     * delete department
     * @param personGroupId department id
     * @return void
     */
    @RequestMark(name = "deletePersonGroup", desc = "删除人员分组（部门）")
    SdkResult<Void> deletePersonGroup(@RequestParam("personGroupId") String personGroupId);

}
