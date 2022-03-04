package com.uniubi.cloud.luna.sdk.common.models.request;

import com.uniubi.cloud.luna.sdk.common.models.SDKBasePageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 查询员工分页请求
 * @author jingmu
 * @since 2020/5/7
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QueryPersonPageRequest extends SDKBasePageRequest {

    /**
     * 人员编号
     * <p>
     * employee no
     */
    private String empNo;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 部门id集合
     * <p>
     * Department id collection
     */
    private List<String> deptIdList;

}
