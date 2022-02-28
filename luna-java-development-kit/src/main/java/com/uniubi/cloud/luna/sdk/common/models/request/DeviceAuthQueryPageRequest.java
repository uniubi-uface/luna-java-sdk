package com.uniubi.cloud.luna.sdk.common.models.request;

import com.uniubi.cloud.luna.sdk.common.models.SDKBasePageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * com.uniubi.medusa.ares.develop.models.request.DeviceAuthQueryPageRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DeviceAuthQueryPageRequest extends SDKBasePageRequest {

    /**
     * 部门id
     */
    private String departmentId;

    /**
     * 员工id
     */
    private String empId;

    /**
     * 员工身份证号
     */
    private String idNo;

    /**
     * 员工类型id
     */
    private String empTypeId;

    /**
     * 员工编号
     */
    private String empNo;

    /**
     * 员工名称
     */
    private String empName;

    /**
     * 员工卡号
     */
    private String cardNum;

    /**
     * 设备分组名称id
     */
    private String deviceGroupId;

    /**
     * 设备序列号
     */
    private String deviceKey;

    /**
     * 设备名称
     */
    private String deviceName;

}
