package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.models.request.UpdatePersonRoleRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class UpdatePersonTypeRequest {

    /**
     * 类型id
     */
    private String typeId;

    /**
     * 类型名称
     */
    private String typeName;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "UpdatePersonTypeRequest{" + "typeId='" + typeId + '\'' + ", typeName='" + typeName + '\'' + '}';
    }

}
