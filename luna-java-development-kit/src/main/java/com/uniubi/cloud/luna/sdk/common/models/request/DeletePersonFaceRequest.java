package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.common.models.request.DeletePersonFaceRequest
 *
 * @author jingmu
 * @since 2020/6/18
 */
public class DeletePersonFaceRequest {

    /**
     * 人员id
     */
    private String empNo;

    /**
     * 人像id
     * <p>
     * photo id,not face id
     */
    private String photoId;

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    @Override
    public String toString() {
        return "DeletePersonFaceRequest{" + "empNo='" + empNo + '\'' + ", photoId='" + photoId + '\'' + '}';
    }

}
