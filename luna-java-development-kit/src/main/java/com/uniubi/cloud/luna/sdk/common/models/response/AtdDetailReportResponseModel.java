package com.uniubi.cloud.luna.sdk.common.models.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author 井木
 * @since 2021/04/14 16:33
 */
@Setter
@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AtdDetailReportResponseModel {

    /**
     * 人员id
     * <p>
     * person id (data id )
     */
    private String personId;

    /**
     * 员工编号
     * <p>
     * person NO.
     */
    private String personNo;

    /**
     * 人员姓名
     */
    private String name;

    /**
     * 部门
     * <p>
     * department names
     */
    private List<String> depNames;

    /**
     * 职位
     * <p>
     * role(position) names
     */
    private List<String> roleNames;

    /**
     * 日期
     * <p>
     * attendance date
     */
    @JSONField(format = "yyyy-MM-dd")
    private LocalDate atDate;

    /**
     * 时间段名称
     */
    private String timeIntervalName;

    /**
     * 应签到时间
     * <p>
     * plan Sign In Datetime
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime planSignInDatetime;

    /**
     * 应签退时间
     * <p>
     * plan Sign Out Datetime
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime planSignOutDatetime;

    /**
     * 时间段计划工作时长，单位秒
     * <p>
     * Planned working duration of time period, in seconds
     */
    private Long planTimeIntervalSecond;

    /**
     * 实际签到时间
     * <p>
     * Actual check-in time
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime realSignInTime;

    /**
     * 签到状态 1正常 2缺卡 3迟到 4早退 5未打卡(缺卡) 6加班
     * <p>
     * Sign in status
     * <li>1 normal</li>
     * <li>2 lack of clock in</li>
     * <li>3 late</li>
     * <li>4 leave early</li>
     * <li>5 not punch in (lack of clock in )</li>
     * <li>6 overtime</li>
     */
    private Byte signInStatus;

    /**
     * 实际签退时间
     * <p>
     * Actual sign out time
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime realSignOutTime;

    /**
     * 签退状态 1正常 2缺卡 3迟到 4早退 5未打卡(缺卡) 6加班
     * <p>
     * Sign out status
     * <li>1 normal</li>
     * <li>2 lack of clock in</li>
     * <li>3 late</li>
     * <li>4 leave early</li>
     * <li>5 not punch in (lack of clock in )</li>
     * <li>6 overtime</li>
     */
    private Byte signOutStatus;

    /**
     * 实际工作时长 单位秒
     * <p>
     * Actual working hours in seconds
     */
    private Long realWorkTimeSecond;

    /**
     * 正常工作时长 单位秒
     * <p>
     * Normal working duration in seconds
     */
    private Long normalWorkSecond;

    /**
     * 迟到时长 单位秒
     * <p>
     * Length of lateness in seconds
     */
    private Long realLateSecond;

    /**
     * 早退时长 单位秒
     * <p>
     * Early leave duration unit: seconds
     */
    private Long realLeaveEarlySecond;

    /**
     * 旷工时长 单位秒
     * <p>
     * Absenteeism in seconds
     */
    private Long realAbsenteeismSecond;

    /**
     * 工作日加班时长 单位秒
     * <p>
     * Working day overtime duration unit: seconds
     */
    private Long workDayOverWorkSecond;

    /**
     * 休息日加班时长 单位秒
     * <p>
     * Overtime hours on rest days (unit: s)
     */
    private Long restDayOverWorkSecond;

    /**
     * 节假日加班时长 单位秒
     * <p>
     * Holiday overtime duration unit: seconds
     */
    private Long holidayOverWorkSecond;

    /**
     * 日期类型：1-工作日(普通时间段)，2-工作日(弹性时间段)，3-休息日，4-节假日，5-未排班
     * <p>
     * Date type:
     * <li>1-working days (normal time period)</li>
     * <li>2-working days (flexible time period)</li>
     * <li>3-rest days</li>
     * <li>4-holidays</li>
     * <li>5-unscheduled shifts</li>
     */
    private Byte dateType;

    /**
     * 开始签到时间,当且仅当dateType=2时有值
     * <p>
     * Start check-in time. It has a value when and only when dateType = 2
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime signInStart;

    /**
     * 结束签到时间,当且仅当dateType=2时有值
     * <p>
     * End check-in time. It has a value when and only when dateType = 2
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime signInEnd;

}
