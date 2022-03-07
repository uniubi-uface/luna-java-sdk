package com.uniubi.cloud.luna.sdk.common.models.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.uniubi.cloud.luna.sdk.common.models.SDKBasePageRequest;

import java.time.LocalDate;

/**
 * @author 井木
 * @since 2021/10/20
 */
public class AtdReportQueryRequest extends SDKBasePageRequest {

    /**
     * 部门id
     * <p>
     * department id
     */
    private String deptId;

    /**
     * 员工名称/编号
     * <p>
     * employee name or NO.
     */
    private String empName;

    /**
     * 开始日期 yyyy-MM-dd
     */
    @JSONField(format = "yyyy-MM-dd")
    private LocalDate startDate;

    /**
     * 结束日期 yyyy-MM-dd
     */
    @JSONField(format = "yyyy-MM-dd")
    private LocalDate endDate;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "AtdReportQueryRequest{" +
                "deptId='" + deptId + '\'' +
                ", empName='" + empName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
