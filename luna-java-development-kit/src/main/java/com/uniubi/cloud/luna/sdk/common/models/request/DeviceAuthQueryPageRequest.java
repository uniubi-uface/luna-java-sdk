package com.uniubi.cloud.luna.sdk.common.models.request;

import com.uniubi.cloud.luna.sdk.common.models.SDKBasePageRequest;

/**
 * com.uniubi.medusa.ares.develop.models.request.DeviceAuthQueryPageRequest
 * @author jingmu
 * @since 2020/5/18
 */
public class DeviceAuthQueryPageRequest extends SDKBasePageRequest {

    /**
     * 部门id
     */
    private String departmentId;

    /**
     * 员工id
     */
    private String empId;

    /**
     * 员工身份证号
     */
    private String idNo;

    /**
     * 员工类型id
     */
    private String empTypeId;

    /**
     * 员工编号
     */
    private String empNo;

    /**
     * 员工名称
     */
    private String empName;

    /**
     * 员工卡号
     */
    private String cardNum;

    /**
     * 设备分组名称id
     */
    private String deviceGroupId;

    /**
     * 设备序列号
     */
    private String deviceKey;

    /**
     * 设备名称
     */
    private String deviceName;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getEmpTypeId() {
        return empTypeId;
    }

    public void setEmpTypeId(String empTypeId) {
        this.empTypeId = empTypeId;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getDeviceGroupId() {
        return deviceGroupId;
    }

    public void setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
    }

    public String getDeviceKey() {
        return deviceKey;
    }

    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public String toString() {
        return "DeviceAuthQueryPageRequest{" + "departmentId='" + departmentId + '\'' + ", empId='" + empId + '\''
            + ", idNo='" + idNo + '\'' + ", empTypeId='" + empTypeId + '\'' + ", empNo='" + empNo + '\''
            + ", empName='" + empName + '\'' + ", cardNum='" + cardNum + '\'' + ", deviceGroupId='" + deviceGroupId
            + '\'' + ", deviceKey='" + deviceKey + '\'' + ", deviceName='" + deviceName + '\'' + '}';
    }

}
