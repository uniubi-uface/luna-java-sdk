package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;

/**
 * com.uniubi.medusa.ares.develop.models.request.UpdatePersonRoleRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
@Data
public class UpdatePersonTypeRequest {

    /**
     * 类型id
     */
    private String typeId;

    /**
     * 类型名称
     */
    private String typeName;

}
