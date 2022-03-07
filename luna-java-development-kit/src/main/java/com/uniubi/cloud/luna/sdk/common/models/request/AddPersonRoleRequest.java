package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.models.request.AddPersonRoleRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class AddPersonRoleRequest {

    /**
     * 角色名称
     * <p>
     * person role(position) name
     */
    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "AddPersonRoleRequest{" +
                "roleName='" + roleName + '\'' +
                '}';
    }
}
