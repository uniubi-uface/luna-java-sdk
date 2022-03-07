package com.uniubi.cloud.luna.sdk.common.models.response;

/**
 * com.uniubi.medusa.ares.develop.models.response.PersonRoleResponseModel
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class PersonRoleResponseModel {

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
        return "PersonRoleResponseModel{" + "roleId='" + roleId + '\'' + ", roleName='" + roleName + '\'' + '}';
    }

}
