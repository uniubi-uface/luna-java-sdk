package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.models.request.ResetDevicePwdRequest
 * @author jingmu
 * @since 2020/5/19
 */
public class ResetDevicePwdRequest extends DeviceOperatorBaseRequest {

    /**
     * 管理员密码
     */
    private String adminPass;

    /**
     * 设备新密码
     */
    private String newPass;

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public String getNewPass() {
        return newPass;
    }

    public void setNewPass(String newPass) {
        this.newPass = newPass;
    }

    @Override
    public String toString() {
        return "ResetDevicePwdRequest{" + "adminPass='" + adminPass + '\'' + ", newPass='" + newPass + '\'' + '}';
    }

}
