package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.models.request.UpdatePersonRoleRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class UpdatePersonRoleRequest {

    /**
     * 角色id
     */
    private String roleId;

    /**
     * 角色名称
     */
    private String roleName;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "UpdatePersonRoleRequest{" + "roleId='" + roleId + '\'' + ", roleName='" + roleName + '\'' + '}';
    }

}
