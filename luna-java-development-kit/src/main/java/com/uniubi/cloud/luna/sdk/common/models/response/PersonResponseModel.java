package com.uniubi.cloud.luna.sdk.common.models.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 员工返回对象
 *
 * @author jingmu
 * @since 2020/5/7
 */
public class PersonResponseModel {

    /**
     * 人员id，数据主键
     * <p>
     * Person ID, data primary key
     */
    private String empId;

    /**
     * 人员编号
     * <p>
     * Employee No
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
     * @deprecated ignore
     */
    @Deprecated
    private String workNo;

    /**
     * 团队id
     * <p>
     * organization id
     */
    private String orgId;

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
     */
    private String cardNo;

    /**
     * 入职时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime entryTime;

    /**
     * 工作地点
     */
    private String workPlace;

    /**
     * 人员类型id
     * @deprecated 未维护
     */
    @Deprecated
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
     */
    private String idCardNo;

    /**
     * 角色id
     */
    private String roleId;

    /**
     * 人像照片id集合
     */
    private List<String> photoIdList;

    /**
     * 所属部门集合id
     * <p>
     * Department Collection id
     */
    private List<String> depIdList;


    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
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

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
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

    public List<String> getPhotoIdList() {
        return photoIdList;
    }

    public void setPhotoIdList(List<String> photoIdList) {
        this.photoIdList = photoIdList;
    }

    public List<String> getDepIdList() {
        return depIdList;
    }

    public void setDepIdList(List<String> depIdList) {
        this.depIdList = depIdList;
    }

    @Override
    public String toString() {
        return "PersonResponseModel{" +
                "empId='" + empId + '\'' +
                ", empNo='" + empNo + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", workNo='" + workNo + '\'' +
                ", orgId='" + orgId + '\'' +
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
                ", photoIdList=" + photoIdList +
                ", depIdList=" + depIdList +
                '}';
    }
}
