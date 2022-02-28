package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;

/**
 * com.uniubi.medusa.ares.develop.models.request.UpdatePersonRoleRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
@Data
public class UpdatePersonRoleRequest {

    /**
     * 角色id
     */
    private String roleId;

    /**
     * 角色名称
     */
    private String roleName;

}
