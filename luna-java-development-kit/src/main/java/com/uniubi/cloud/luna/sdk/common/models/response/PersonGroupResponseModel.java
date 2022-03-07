package com.uniubi.cloud.luna.sdk.common.models.response;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.response.PersonGroupResponseModel
 *
 * @author jingmu
 * @since 2020/5/15
 */
public class PersonGroupResponseModel {

    /**
     * 部门id
     * <p>
     * department id
     */
    private String personGroupId;

    /**
     * 部门名称
     * <p>
     * department name
     */
    private String personGroupName;

    /**
     * 父级部门id
     * <p>
     * parent department id
     */
    private String parentGroupId;

    /**
     * 管理员person id集合
     * <p>
     * manager id list
     */
    private List<String> managerNos;


    public String getPersonGroupId() {
        return personGroupId;
    }

    public void setPersonGroupId(String personGroupId) {
        this.personGroupId = personGroupId;
    }

    public String getPersonGroupName() {
        return personGroupName;
    }

    public void setPersonGroupName(String personGroupName) {
        this.personGroupName = personGroupName;
    }

    public String getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    public List<String> getManagerNos() {
        return managerNos;
    }

    public void setManagerNos(List<String> managerNos) {
        this.managerNos = managerNos;
    }

    @Override
    public String toString() {
        return "PersonGroupResponseModel{" +
                "personGroupId='" + personGroupId + '\'' +
                ", personGroupName='" + personGroupName + '\'' +
                ", parentGroupId='" + parentGroupId + '\'' +
                ", managerNos=" + managerNos +
                '}';
    }
}
