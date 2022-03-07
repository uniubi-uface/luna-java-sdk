package com.uniubi.cloud.luna.sdk.common.models.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author 井木
 * @since 2021/04/14 16:33
 */
public class AtdDetailReportResponseModel implements Serializable {

    private static final long serialVersionUID = -3990452299731420438L;

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

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonNo() {
        return personNo;
    }

    public void setPersonNo(String personNo) {
        this.personNo = personNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDepNames() {
        return depNames;
    }

    public void setDepNames(List<String> depNames) {
        this.depNames = depNames;
    }

    public List<String> getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
    }

    public LocalDate getAtDate() {
        return atDate;
    }

    public void setAtDate(LocalDate atDate) {
        this.atDate = atDate;
    }

    public String getTimeIntervalName() {
        return timeIntervalName;
    }

    public void setTimeIntervalName(String timeIntervalName) {
        this.timeIntervalName = timeIntervalName;
    }

    public LocalDateTime getPlanSignInDatetime() {
        return planSignInDatetime;
    }

    public void setPlanSignInDatetime(LocalDateTime planSignInDatetime) {
        this.planSignInDatetime = planSignInDatetime;
    }

    public LocalDateTime getPlanSignOutDatetime() {
        return planSignOutDatetime;
    }

    public void setPlanSignOutDatetime(LocalDateTime planSignOutDatetime) {
        this.planSignOutDatetime = planSignOutDatetime;
    }

    public Long getPlanTimeIntervalSecond() {
        return planTimeIntervalSecond;
    }

    public void setPlanTimeIntervalSecond(Long planTimeIntervalSecond) {
        this.planTimeIntervalSecond = planTimeIntervalSecond;
    }

    public LocalDateTime getRealSignInTime() {
        return realSignInTime;
    }

    public void setRealSignInTime(LocalDateTime realSignInTime) {
        this.realSignInTime = realSignInTime;
    }

    public Byte getSignInStatus() {
        return signInStatus;
    }

    public void setSignInStatus(Byte signInStatus) {
        this.signInStatus = signInStatus;
    }

    public LocalDateTime getRealSignOutTime() {
        return realSignOutTime;
    }

    public void setRealSignOutTime(LocalDateTime realSignOutTime) {
        this.realSignOutTime = realSignOutTime;
    }

    public Byte getSignOutStatus() {
        return signOutStatus;
    }

    public void setSignOutStatus(Byte signOutStatus) {
        this.signOutStatus = signOutStatus;
    }

    public Long getRealWorkTimeSecond() {
        return realWorkTimeSecond;
    }

    public void setRealWorkTimeSecond(Long realWorkTimeSecond) {
        this.realWorkTimeSecond = realWorkTimeSecond;
    }

    public Long getNormalWorkSecond() {
        return normalWorkSecond;
    }

    public void setNormalWorkSecond(Long normalWorkSecond) {
        this.normalWorkSecond = normalWorkSecond;
    }

    public Long getRealLateSecond() {
        return realLateSecond;
    }

    public void setRealLateSecond(Long realLateSecond) {
        this.realLateSecond = realLateSecond;
    }

    public Long getRealLeaveEarlySecond() {
        return realLeaveEarlySecond;
    }

    public void setRealLeaveEarlySecond(Long realLeaveEarlySecond) {
        this.realLeaveEarlySecond = realLeaveEarlySecond;
    }

    public Long getRealAbsenteeismSecond() {
        return realAbsenteeismSecond;
    }

    public void setRealAbsenteeismSecond(Long realAbsenteeismSecond) {
        this.realAbsenteeismSecond = realAbsenteeismSecond;
    }

    public Long getWorkDayOverWorkSecond() {
        return workDayOverWorkSecond;
    }

    public void setWorkDayOverWorkSecond(Long workDayOverWorkSecond) {
        this.workDayOverWorkSecond = workDayOverWorkSecond;
    }

    public Long getRestDayOverWorkSecond() {
        return restDayOverWorkSecond;
    }

    public void setRestDayOverWorkSecond(Long restDayOverWorkSecond) {
        this.restDayOverWorkSecond = restDayOverWorkSecond;
    }

    public Long getHolidayOverWorkSecond() {
        return holidayOverWorkSecond;
    }

    public void setHolidayOverWorkSecond(Long holidayOverWorkSecond) {
        this.holidayOverWorkSecond = holidayOverWorkSecond;
    }

    public Byte getDateType() {
        return dateType;
    }

    public void setDateType(Byte dateType) {
        this.dateType = dateType;
    }

    public LocalDateTime getSignInStart() {
        return signInStart;
    }

    public void setSignInStart(LocalDateTime signInStart) {
        this.signInStart = signInStart;
    }

    public LocalDateTime getSignInEnd() {
        return signInEnd;
    }

    public void setSignInEnd(LocalDateTime signInEnd) {
        this.signInEnd = signInEnd;
    }

    @Override
    public String toString() {
        return "AtdDetailReportResponseModel{" + "personId='" + personId + '\'' + ", personNo='" + personNo + '\''
                + ", name='" + name + '\'' + ", depNames=" + depNames + ", roleNames=" + roleNames + ", atDate="
                + atDate + ", timeIntervalName='" + timeIntervalName + '\'' + ", planSignInDatetime="
                + planSignInDatetime + ", planSignOutDatetime=" + planSignOutDatetime + ", planTimeIntervalSecond="
                + planTimeIntervalSecond + ", realSignInTime=" + realSignInTime + ", signInStatus=" + signInStatus
                + ", realSignOutTime=" + realSignOutTime + ", signOutStatus=" + signOutStatus + ", realWorkTimeSecond="
                + realWorkTimeSecond + ", normalWorkSecond=" + normalWorkSecond + ", realLateSecond=" + realLateSecond
                + ", realLeaveEarlySecond=" + realLeaveEarlySecond + ", realAbsenteeismSecond=" + realAbsenteeismSecond
                + ", workDayOverWorkSecond=" + workDayOverWorkSecond + ", restDayOverWorkSecond="
                + restDayOverWorkSecond + ", holidayOverWorkSecond=" + holidayOverWorkSecond + ", dateType=" + dateType
                + ", signInStart=" + signInStart + ", signInEnd=" + signInEnd + '}';
    }

}
