package com.uniubi.cloud.luna.sdk.common.models.request;

import java.util.Arrays;

/**
 * com.uniubi.medusa.ares.develop.common.models.request.AddPersonFaceRequest
 *
 * @author jingmu
 * @since 2020/6/18
 */
public class AddPersonFaceRequest {

    /**
     * 人员id
     */
    private String empNo;

    /**
     * 文件数据
     * <p>
     * face file data
     */
    private byte[] faceData;

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public byte[] getFaceData() {
        return faceData;
    }

    public void setFaceData(byte[] faceData) {
        this.faceData = faceData;
    }

    @Override
    public String toString() {
        return "AddPersonFaceRequest{" + "empNo='" + empNo + '\'' + ", faceData=" + Arrays.toString(faceData) + '}';
    }

}
