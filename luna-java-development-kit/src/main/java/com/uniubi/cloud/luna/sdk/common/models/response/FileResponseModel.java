package com.uniubi.cloud.luna.sdk.common.models.response;

import java.util.Arrays;

/**
 * com.uniubi.medusa.ares.develop.models.response.FileResponseModel
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class FileResponseModel {

    private byte[] content;

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "FileResponseModel{" + "content=" + Arrays.toString(content) + '}';
    }

}
