package com.uniubi.cloud.luna.sdk.common.models.response;

import lombok.Data;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.response.PersonGroupResponseModel
 * @author jingmu
 * @since 2020/5/15
 */
@Data
public class PersonGroupResponseModel {

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
     * 管理员person id集合
     * <p>
     * manager id list
     */
    private List<String> managerNos;

}
