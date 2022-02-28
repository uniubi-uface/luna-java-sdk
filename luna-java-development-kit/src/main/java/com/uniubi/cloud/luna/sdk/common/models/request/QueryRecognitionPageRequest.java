package com.uniubi.cloud.luna.sdk.common.models.request;

import com.uniubi.cloud.luna.sdk.common.models.SDKBasePageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.request.QueryRecognitionPageRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QueryRecognitionPageRequest extends SDKBasePageRequest {

    /**
     * 人员编号
     */
    private List<String> empNos;

    /**
     * 团队id
     */
    private String orgId;

    /**
     * 识别记录类型
     */
    private Byte recMode;

    /**
     * 开始时间
     */
    private Long startTime;

    /**
     * 结束时间
     */
    private Long endTime;

    /**
     * 业务日期
     */
    private String statDate;

}
