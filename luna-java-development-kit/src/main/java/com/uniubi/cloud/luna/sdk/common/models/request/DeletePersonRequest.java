package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * 删除人员请求
 *
 * @author jingmu
 * @since 2020/5/7
 */
public class DeletePersonRequest {

    /**
     * 人员id
     */
    private String empId;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "DeletePersonRequest{" +
                "empId='" + empId + '\'' +
                '}';
    }
}
