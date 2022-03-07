package com.uniubi.cloud.luna.sdk.common.models.request;

import java.util.List;

/**
 * 更新人员分组（部门）请求
 *
 * @author jingmu
 * @since 2020/5/15
 */
public class UpdatePersonGroupRequest {

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
     * 部门管理员personId集合
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
        return "UpdatePersonGroupRequest{" +
                "personGroupId='" + personGroupId + '\'' +
                ", personGroupName='" + personGroupName + '\'' +
                ", parentGroupId='" + parentGroupId + '\'' +
                ", managerNos=" + managerNos +
                '}';
    }
}
