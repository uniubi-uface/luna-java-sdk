package com.uniubi.cloud.luna.sdk.common.models.response;

/**
 * com.uniubi.medusa.ares.develop.models.response.FinishTaskResponseModel
 * @author jingmu
 * @since 2020/5/18
 */
public class FinishTaskResponseModel {

    private Boolean success;

    private String failedReason;

    private DeviceTaskInfoResponseModel taskInfo;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public DeviceTaskInfoResponseModel getTaskInfo() {
        return taskInfo;
    }

    public void setTaskInfo(DeviceTaskInfoResponseModel taskInfo) {
        this.taskInfo = taskInfo;
    }

    @Override
    public String toString() {
        return "FinishTaskResponseModel{" + "success=" + success + ", failedReason='" + failedReason + '\''
            + ", taskInfo=" + taskInfo + '}';
    }

}
