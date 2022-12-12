package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.models.request.GetImageRequest
 * @author jingmu
 * @since 2020/5/18
 */
public class GetImageRequest {

    private String imageId;

    private String faceId;

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    @Override
    public String toString() {
        return "GetImageRequest{" + "imageId='" + imageId + '\'' + ", faceId='" + faceId + '\'' + '}';
    }

}
