package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * <p class="detail">
 * 功能:
 * </p>
 *
 * @author HuangHuizhou ClassName Add person type request.
 * @version V1.0.
 * @since 2020.10.14 09:47:17
 */
public class AddPersonTypeRequest {

    /**
     * 类型名称
     */
    private String typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "AddPersonTypeRequest{" +
                "typeName='" + typeName + '\'' +
                '}';
    }
}
