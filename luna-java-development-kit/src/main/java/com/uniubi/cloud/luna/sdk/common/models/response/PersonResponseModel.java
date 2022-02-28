package com.uniubi.cloud.luna.sdk.common.models.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 员工返回对象
 *
 * @author jingmu
 * @since 2020/5/7
 */
@Data
public class PersonResponseModel {

    /**
     * 人员id，数据主键
     */
    private String empId;

    /**
     * 人员编号
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
     * 团队id
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
     * 人像集合id
     */
    private List<String> photoIdList;

    /**
     * 所属部门集合id
     */
    private List<String> depIdList;

}