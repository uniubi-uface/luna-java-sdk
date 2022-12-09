package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * @author 井木
 * @since 2022/12/09
 */
public class GenerateEmpQrCodeRequest {

    /**
     * 员工ID
     */
    private String empId;

    /**
     * 有效期类型 1：一个月，2：三个月，3：半年，4：一年，5：永久
     */
    private Integer effectiveTimeType;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Integer getEffectiveTimeType() {
        return effectiveTimeType;
    }

    public void setEffectiveTimeType(Integer effectiveTimeType) {
        this.effectiveTimeType = effectiveTimeType;
    }

    @Override
    public String toString() {
        return "GenerateEmpQrCodeRequest{" +
            "empId='" + empId + '\'' +
            ", effectiveTimeType=" + effectiveTimeType +
            '}';
    }
}
