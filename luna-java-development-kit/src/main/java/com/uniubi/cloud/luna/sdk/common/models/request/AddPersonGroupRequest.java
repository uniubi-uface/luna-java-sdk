package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;

import java.util.List;

/**
 * 添加员工分组请求
 *
 * @author jingmu
 * @since 2020/5/15
 */
@Data
public class AddPersonGroupRequest {

    /**
     * 部门名称
     */
    private String personGroupName;

    /**
     * 父级部门id
     */
    private String parentGroupId;

    /**
     * 管理员person NO 集合
     */
    private List<String> managerNos;

}
