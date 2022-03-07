package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * <p class="detail">
 * 功能:
 * </p>
 *
 * @author HuangHuizhou ClassName Delete person type request.
 * @version V1.0.
 * @since 2020.10.14 10:08:17
 */
public class DeletePersonTypeRequest {

    private String typeId;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "DeletePersonTypeRequest{" + "typeId='" + typeId + '\'' + '}';
    }

}
