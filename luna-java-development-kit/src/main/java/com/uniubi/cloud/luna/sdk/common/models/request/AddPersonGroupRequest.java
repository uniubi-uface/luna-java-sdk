package com.uniubi.cloud.luna.sdk.common.models.request;

import java.util.List;

/**
 * 添加员工分组请求
 *
 * @author jingmu
 * @since 2020/5/15
 */
public class AddPersonGroupRequest {

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
     * 管理员 person id 集合
     * <p>
     * department manager id list
     */
    private List<String> managerIds;

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

    public List<String> getManagerIds() {
        return managerIds;
    }

    public void setManagerIds(List<String> managerIds) {
        this.managerIds = managerIds;
    }

    @Override
    public String toString() {
        return "AddPersonGroupRequest{" +
                "personGroupName='" + personGroupName + '\'' +
                ", parentGroupId='" + parentGroupId + '\'' +
                ", managerIds=" + managerIds +
                '}';
    }
}
