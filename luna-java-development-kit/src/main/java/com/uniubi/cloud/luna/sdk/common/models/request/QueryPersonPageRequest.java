package com.uniubi.cloud.luna.sdk.common.models.request;

import com.uniubi.cloud.luna.sdk.common.models.SDKBasePageRequest;

import java.util.List;

/**
 * 查询员工分页请求
 *
 * @author jingmu
 * @since 2020/5/7
 */
public class QueryPersonPageRequest extends SDKBasePageRequest {

    /**
     * 人员编号
     * <p>
     * employee no
     */
    private String empNo;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 部门id集合
     * <p>
     * Department id collection
     */
    private List<String> deptIdList;

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDeptIdList() {
        return deptIdList;
    }

    public void setDeptIdList(List<String> deptIdList) {
        this.deptIdList = deptIdList;
    }

    @Override
    public String toString() {
        return "QueryPersonPageRequest{" + "empNo='" + empNo + '\'' + ", name='" + name + '\'' + ", deptIdList="
                + deptIdList + '}';
    }

}
