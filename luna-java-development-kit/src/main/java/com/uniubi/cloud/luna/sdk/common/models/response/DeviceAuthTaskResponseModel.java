package com.uniubi.cloud.luna.sdk.common.models.response;

import java.time.LocalDateTime;
import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.response.DeviceAuthTaskResponseModel
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class DeviceAuthTaskResponseModel {

    private Boolean finished;

    private Integer totalSubTaskNum;

    private Integer finishedSubTaskNum;

    private Byte taskState;

    private Byte taskResult;

    private LocalDateTime taskStartDate;

    private List<FinishTaskResponseModel> finishedTaskInfoList;

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Integer getTotalSubTaskNum() {
        return totalSubTaskNum;
    }

    public void setTotalSubTaskNum(Integer totalSubTaskNum) {
        this.totalSubTaskNum = totalSubTaskNum;
    }

    public Integer getFinishedSubTaskNum() {
        return finishedSubTaskNum;
    }

    public void setFinishedSubTaskNum(Integer finishedSubTaskNum) {
        this.finishedSubTaskNum = finishedSubTaskNum;
    }

    public Byte getTaskState() {
        return taskState;
    }

    public void setTaskState(Byte taskState) {
        this.taskState = taskState;
    }

    public Byte getTaskResult() {
        return taskResult;
    }

    public void setTaskResult(Byte taskResult) {
        this.taskResult = taskResult;
    }

    public LocalDateTime getTaskStartDate() {
        return taskStartDate;
    }

    public void setTaskStartDate(LocalDateTime taskStartDate) {
        this.taskStartDate = taskStartDate;
    }

    public List<FinishTaskResponseModel> getFinishedTaskInfoList() {
        return finishedTaskInfoList;
    }

    public void setFinishedTaskInfoList(List<FinishTaskResponseModel> finishedTaskInfoList) {
        this.finishedTaskInfoList = finishedTaskInfoList;
    }

    @Override
    public String toString() {
        return "DeviceAuthTaskResponseModel{" + "finished=" + finished + ", totalSubTaskNum=" + totalSubTaskNum
                + ", finishedSubTaskNum=" + finishedSubTaskNum + ", taskState=" + taskState + ", taskResult="
                + taskResult + ", taskStartDate=" + taskStartDate + ", finishedTaskInfoList=" + finishedTaskInfoList
                + '}';
    }

}
