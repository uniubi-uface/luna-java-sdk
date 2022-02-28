package com.uniubi.cloud.luna.sdk.common.models.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.uniubi.cloud.luna.sdk.common.models.SDKBasePageRequest;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

/**
 * @author 井木
 * @since 2021/10/20
 */
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AtdReportQueryRequest extends SDKBasePageRequest {

    /*** 部门id */
    private String deptId;

    /*** 员工名称/编号 */
    private String empName;

    /*** 开始日期 yyyy-MM-dd */
    @JSONField(format = "yyyy-MM-dd")
    private LocalDate startDate;

    /*** 结束日期 yyyy-MM-dd */
    @JSONField(format = "yyyy-MM-dd")
    private LocalDate endDate;

}
