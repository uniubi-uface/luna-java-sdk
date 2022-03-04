package com.uniubi.cloud.luna.sdk.common.models;

import lombok.Data;

/**
 * com.uniubi.medusa.ares.develop.models.SDKBasePageRequest
 * @author jingmu
 * @since 2020/5/15
 */
@Data
public class SDKBasePageRequest {

    /**
     * 页码
     */
    private Integer pageNum = 1;

    /**
     * 每页限制条数
     */
    private Integer pageSize = 10;

}
