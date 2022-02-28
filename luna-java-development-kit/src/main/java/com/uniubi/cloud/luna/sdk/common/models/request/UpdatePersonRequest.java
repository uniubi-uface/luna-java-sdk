package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 更新员工请求
 *
 * @author jingmu
 * @since 2020/5/7
 */
@Data
public class UpdatePersonRequest {

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
    private LocalDateTime entryTime;

    /**
     * 工作地点
     */
    private String workPlace;

    /**
     * 员工类型
     */
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
     * 所属部门集合id
     */
    private List<String> deptIdList;

}
