package com.uniubi.cloud.luna.sdk.clients;

import com.uniubi.cloud.luna.sdk.common.annotation.RequestMark;
import com.uniubi.cloud.luna.sdk.common.models.SDKPageInfo;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;
import com.uniubi.cloud.luna.sdk.common.models.request.AtdReportQueryRequest;
import com.uniubi.cloud.luna.sdk.common.models.response.AtdBreakTimeReportResponseModel;
import com.uniubi.cloud.luna.sdk.common.models.response.AtdDetailReportResponseModel;
import com.uniubi.cloud.luna.sdk.common.models.response.AtdExceptionReportResponseModel;
import com.uniubi.cloud.luna.sdk.common.models.response.AtdOverWorkReportResponseModel;

/**
 * 考勤相关 API， 提供考勤报表查询方法
 * <p>
 * The attendance related API provides the query method of attendance report
 * @author 井木
 * @since 2021/10/20
 */
public interface SdkAtdReportApi {

    /**
     * Query of attendance details Report
     * @param queryRequest 请求参数
     * @return report list
     */
    @RequestMark(name = "atdDetailReport", desc = "考勤明细报表查询")
    SdkResult<SDKPageInfo<AtdDetailReportResponseModel>> atdDetailReport(AtdReportQueryRequest queryRequest);

    /**
     * Query attendance overtime Report
     * @param queryRequest 请求参数
     * @return report list
     */
    @RequestMark(name = "atdOverWorkReport", desc = "考勤加班报表")
    SdkResult<SDKPageInfo<AtdOverWorkReportResponseModel>> atdOverWorkReport(AtdReportQueryRequest queryRequest);

    /**
     * Query attendance rest Report
     * @param queryRequest 请求参数
     * @return report list
     */
    @RequestMark(name = "atdBreakTimeReport", desc = "考勤休息报表")
    SdkResult<SDKPageInfo<AtdBreakTimeReportResponseModel>> atdBreakTimeReport(AtdReportQueryRequest queryRequest);

    /**
     * query abnormal clock list.
     * @param queryRequest 请求参数
     * @return report list
     */
    @RequestMark(name = "atdExceptionReport", desc = "考勤异常打卡报表")
    SdkResult<SDKPageInfo<AtdExceptionReportResponseModel>> atdExceptionReport(AtdReportQueryRequest queryRequest);

}
