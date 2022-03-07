package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.models.request.GetDeviceAuthTaskRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class GetDeviceAuthTaskRequest {

    private String taskId;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public String toString() {
        return "GetDeviceAuthTaskRequest{" + "taskId='" + taskId + '\'' + '}';
    }

}
