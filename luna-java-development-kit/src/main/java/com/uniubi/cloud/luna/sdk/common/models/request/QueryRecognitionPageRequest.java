package com.uniubi.cloud.luna.sdk.common.models.request;

import com.uniubi.cloud.luna.sdk.common.models.SDKBasePageRequest;

import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.request.QueryRecognitionPageRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class QueryRecognitionPageRequest extends SDKBasePageRequest {

    /**
     * 人员编号
     * <p>
     * employee no list
     */
    private List<String> empNos;

    /**
     * 团队id
     * <p>
     * organization id
     */
    private String orgId;

    /**
     * 识别记录类型
     * <p>
     * recognition mode
     */
    private Byte recMode;

    /**
     * 开始时间
     * <p>
     * start time, unit : second
     */
    private Long startTime;

    /**
     * 结束时间
     * <p>
     * end time, unit :second
     */
    private Long endTime;

    /**
     * 日期
     * <p>
     * date
     */
    private String statDate;

    public List<String> getEmpNos() {
        return empNos;
    }

    public void setEmpNos(List<String> empNos) {
        this.empNos = empNos;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public Byte getRecMode() {
        return recMode;
    }

    public void setRecMode(Byte recMode) {
        this.recMode = recMode;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public String getStatDate() {
        return statDate;
    }

    public void setStatDate(String statDate) {
        this.statDate = statDate;
    }

    @Override
    public String toString() {
        return "QueryRecognitionPageRequest{" +
                "empNos=" + empNos +
                ", orgId='" + orgId + '\'' +
                ", recMode=" + recMode +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", statDate='" + statDate + '\'' +
                '}';
    }
}
