package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;

import java.util.List;

/**
 * 更新人员分组（部门）请求
 *
 * @author jingmu
 * @since 2020/5/15
 */
@Data
public class UpdatePersonGroupRequest {

    /**
     * 部门id
     * <p>
     * department id
     */
    private String personGroupId;

    /**
     * 部门名称
     * <p>
     * department name
     */
    private String personGroupName;

    /**
     * 父级部门id
     * <p>
     * parent department id
     */
    private String parentGroupId;

    /**
     * 部门管理员personId集合
     * <p>
     * manager id list
     */
    private List<String> managerNos;

}
