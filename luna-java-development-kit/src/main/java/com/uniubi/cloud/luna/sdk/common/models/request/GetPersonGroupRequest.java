package com.uniubi.cloud.luna.sdk.common.models.request;

/**
 * com.uniubi.medusa.ares.develop.models.request.GetPersonGroupRequest
 *
 * @author jingmu
 * @since 2020/5/18
 */
public class GetPersonGroupRequest {

    private String personGroupId;

    public String getPersonGroupId() {
        return personGroupId;
    }

    public void setPersonGroupId(String personGroupId) {
        this.personGroupId = personGroupId;
    }

    @Override
    public String toString() {
        return "GetPersonGroupRequest{" + "personGroupId='" + personGroupId + '\'' + '}';
    }

}
