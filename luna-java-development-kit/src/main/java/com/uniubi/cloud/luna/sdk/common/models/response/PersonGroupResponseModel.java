package com.uniubi.cloud.luna.sdk.common.models.response;

import lombok.Data;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.response.PersonGroupResponseModel
 *
 * @author jingmu
 * @since 2020/5/15
 */
@Data
public class PersonGroupResponseModel {

    /**
     * 部门id
     */
    private String personGroupId;

    /**
     * 部门名称
     */
    private String personGroupName;

    /**
     * 父级部门id
     */
    private String parentGroupId;

    /**
     * 管理员personNo集合
     */
    private List<String> managerNos;

}
