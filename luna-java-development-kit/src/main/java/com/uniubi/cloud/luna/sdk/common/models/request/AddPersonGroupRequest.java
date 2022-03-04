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
     * 管理员 person id 集合
     * <p>
     * department manager id list
     */
    private List<String> managerIds;

}
