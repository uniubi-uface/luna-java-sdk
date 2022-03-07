package com.uniubi.cloud.luna.sdk.common.models;

/**
 * com.uniubi.medusa.ares.develop.models.SDKBasePageRequest
 *
 * @author jingmu
 * @since 2020/5/15
 */
public class SDKBasePageRequest {

    /**
     * 页码
     */
    private Integer pageNum = 1;

    /**
     * 每页限制条数
     */
    private Integer pageSize = 10;


    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "SDKBasePageRequest{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }
}
