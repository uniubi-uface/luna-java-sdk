package com.uniubi.cloud.luna.sdk.common.models.response;

/**
 * com.uniubi.medusa.ares.develop.models.response.PersonRoleResponseModel
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class PersonTypeResponseModel {

    /**
     * 人员类型id
     */
    private String typeId;

    /**
     * 人员类型名称
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
        return "PersonTypeResponseModel{" +
                "typeId='" + typeId + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
