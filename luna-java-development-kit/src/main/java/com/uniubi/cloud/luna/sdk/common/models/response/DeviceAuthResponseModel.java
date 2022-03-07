package com.uniubi.cloud.luna.sdk.common.models.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.uniubi.cloud.luna.sdk.common.models.request.DeviceAuthPermissionTime;

import java.time.LocalDateTime;
import java.util.List;

/**
 * com.uniubi.medusa.ares.develop.models.response.DeviceAuthResponseModel
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class DeviceAuthResponseModel {

    /**
     * 员工编号
     */
    private String empNo;

    /**
     * 设备序列号
     */
    private String deviceKey;

    /**
     * 员工权限类型
     */
    private List<Byte> recModeTypes;

    /**
     * 员工授权的人像
     */
    private List<AresPersonFaceResponseModel> faces;

    /**
     * 人员时间权限
     */
    private DeviceAuthPermissionTime permissionTime;

    /**
     * 授权创建时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getDeviceKey() {
        return deviceKey;
    }

    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
    }

    public List<Byte> getRecModeTypes() {
        return recModeTypes;
    }

    public void setRecModeTypes(List<Byte> recModeTypes) {
        this.recModeTypes = recModeTypes;
    }

    public List<AresPersonFaceResponseModel> getFaces() {
        return faces;
    }

    public void setFaces(List<AresPersonFaceResponseModel> faces) {
        this.faces = faces;
    }

    public DeviceAuthPermissionTime getPermissionTime() {
        return permissionTime;
    }

    public void setPermissionTime(DeviceAuthPermissionTime permissionTime) {
        this.permissionTime = permissionTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "DeviceAuthResponseModel{" + "empNo='" + empNo + '\'' + ", deviceKey='" + deviceKey + '\''
                + ", recModeTypes=" + recModeTypes + ", faces=" + faces + ", permissionTime=" + permissionTime
                + ", createTime=" + createTime + '}';
    }

}
