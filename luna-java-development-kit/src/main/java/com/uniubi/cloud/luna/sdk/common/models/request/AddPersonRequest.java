package com.uniubi.cloud.luna.sdk.common.models.request;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 添加员工请求
 * @author jingmu
 * @since 2020/5/7
 */
public class AddPersonRequest {

    /**
     * 人员编号
     * <p>
     * employee No.
     */
    private String empNo;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 手机
     */
    private String phone;

    /**
     * 工号
     */
    private String workNo;

    /**
     * 邮件
     */
    private String mail;

    /**
     * 花名
     */
    private String stageName;

    /**
     * 卡号
     * <p>
     * Card No
     */
    private String cardNo;

    /**
     * 入职时间
     * <p>
     * entry Time
     */
    private LocalDateTime entryTime;

    /**
     * 工作地点
     */
    private String workPlace;

    /**
     * 员工类型ID
     */
    private String personTypeId;

    /**
     * 座机
     * <p>
     * telephone
     */
    private String tel;

    /**
     * 性别
     */
    private Byte gender;

    /**
     * 身份证
     * <p>
     * ID Card
     */
    private String idCardNo;

    /**
     * 角色id
     */
    private String roleId;

    /**
     * 所属部门集合id
     * <p>
     * Department Collection id
     */
    private List<String> deptIdList;

    /**
     * 二维码ID
     */
    private String qrCodeId;

    public String getQrCodeId() {
        return qrCodeId;
    }

    public void setQrCodeId(String qrCodeId) {
        this.qrCodeId = qrCodeId;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getPersonTypeId() {
        return personTypeId;
    }

    public void setPersonTypeId(String personTypeId) {
        this.personTypeId = personTypeId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public List<String> getDeptIdList() {
        return deptIdList;
    }

    public void setDeptIdList(List<String> deptIdList) {
        this.deptIdList = deptIdList;
    }

    @Override
    public String toString() {
        return "AddPersonRequest{" +
            "empNo='" + empNo + '\'' +
            ", name='" + name + '\'' +
            ", phone='" + phone + '\'' +
            ", workNo='" + workNo + '\'' +
            ", mail='" + mail + '\'' +
            ", stageName='" + stageName + '\'' +
            ", cardNo='" + cardNo + '\'' +
            ", entryTime=" + entryTime +
            ", workPlace='" + workPlace + '\'' +
            ", personTypeId='" + personTypeId + '\'' +
            ", tel='" + tel + '\'' +
            ", gender=" + gender +
            ", idCardNo='" + idCardNo + '\'' +
            ", roleId='" + roleId + '\'' +
            ", deptIdList=" + deptIdList +
            ", qrCodeId='" + qrCodeId + '\'' +
            '}';
    }
}
