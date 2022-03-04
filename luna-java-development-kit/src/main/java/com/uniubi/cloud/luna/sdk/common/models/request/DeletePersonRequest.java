package com.uniubi.cloud.luna.sdk.common.models.request;

import lombok.Data;

/**
 * 删除人员请求
 * @author jingmu
 * @since 2020/5/7
 */
@Data
public class DeletePersonRequest {

    /**
     * 人员id
     */
    private String empId;

}
