package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.models.request.DeletePersonRoleRequest
 * @author jingmu
 * @since 2020/5/18
 */
public class DeletePersonRoleRequest {

    private String roleId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "DeletePersonRoleRequest{" + "roleId='" + roleId + '\'' + '}';
    }

}
