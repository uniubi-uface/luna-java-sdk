package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.models.request.DeletePersonGroupRequest
 * @author jingmu
 * @since 2020/5/18
 */
public class DeletePersonGroupRequest {

    private String personGroupId;

    public String getPersonGroupId() {
        return personGroupId;
    }

    public void setPersonGroupId(String personGroupId) {
        this.personGroupId = personGroupId;
    }

    @Override
    public String toString() {
        return "DeletePersonGroupRequest{" + "personGroupId='" + personGroupId + '\'' + '}';
    }

}
