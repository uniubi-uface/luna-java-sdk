package com.uniubi.cloud.luna.sdk.common.models;

/**
 * sdk统一返回结果对象
 * @author jingmu
 * @since 2020/5/6
 */
public class SdkResult<T> {

    /**
     * 是否成功
     */
    protected boolean success;

    /**
     * 返回code码
     */
    protected String code;

    /**
     * 错误信息
     */
    protected String msg;

    /**
     * 返回结果数据
     */
    protected T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SdkResult{" + "success=" + success + ", code='" + code + '\'' + ", msg='" + msg + '\'' + ", data="
            + data + '}';
    }

}
