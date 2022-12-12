package com.uniubi.cloud.luna.sdk.springboot.example.config;

import com.uniubi.cloud.luna.sdk.clients.LunaSdkApiClient;
import com.uniubi.cloud.luna.sdk.clients.SdkAtdReportApi;
import com.uniubi.cloud.luna.sdk.clients.SdkDeviceApi;
import com.uniubi.cloud.luna.sdk.clients.SdkDeviceAuthApi;
import com.uniubi.cloud.luna.sdk.clients.SdkDeviceCommandApi;
import com.uniubi.cloud.luna.sdk.clients.SdkDeviceGroupApi;
import com.uniubi.cloud.luna.sdk.clients.SdkDeviceSearchApi;
import com.uniubi.cloud.luna.sdk.clients.SdkFileApi;
import com.uniubi.cloud.luna.sdk.clients.SdkPersonApi;
import com.uniubi.cloud.luna.sdk.clients.SdkPersonFaceApi;
import com.uniubi.cloud.luna.sdk.clients.SdkPersonGroupApi;
import com.uniubi.cloud.luna.sdk.clients.SdkPersonRoleApi;
import com.uniubi.cloud.luna.sdk.clients.SdkPersonTypeApi;
import com.uniubi.cloud.luna.sdk.clients.SdkRecognitionApi;
import com.uniubi.cloud.luna.sdk.clients.SdkTestApi;
import com.uniubi.cloud.luna.sdk.common.RequestConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * create api client bean
 * @author 井木
 * @since 2022/02/24
 */
@EnableConfigurationProperties
@Configuration
public class AthenaSdkConfig {

    @Bean
    @ConditionalOnMissingBean(LunaSdkApiClient.class)
    public LunaSdkApiClient lunaSdkApiClient(LunaSdkConfigProperties properties) {
        // 1. new RequestConfig
        RequestConfig requestConfig = new RequestConfig();
        // 2. set connection time out
        requestConfig.setConnectionTimeoutMills(properties.getConnectionTimeoutMills());
        requestConfig.setReadTimeoutMills(properties.getReadTimeoutMills());
        // 3. set your public key
        requestConfig.setPublicKey(properties.getPublicKey());
        // 4. set service end point if necessary
        requestConfig.setEndPoint("http://127.0.0.1:8080");
        // 5. create the LunaSdkApiClient
        return new LunaSdkApiClient(properties.getAccessKey(), properties.getAccessSecret(), requestConfig);
    }

    @Bean
    @ConditionalOnMissingBean(SdkTestApi.class)
    public SdkTestApi sdkTestApi(LunaSdkApiClient apiClient) {
        return apiClient.createSdkTestApi();
    }

    @Bean
    @ConditionalOnMissingBean(SdkPersonApi.class)
    public SdkPersonApi sdkDeviceRecognitionApi(LunaSdkApiClient apiClient) {
        return apiClient.createSdkPersonApi();
    }

    @Bean
    @ConditionalOnMissingBean(SdkPersonRoleApi.class)
    public SdkPersonRoleApi createSdkPersonRoleApi(LunaSdkApiClient apiClient) {
        return apiClient.createSdkPersonRoleApi();
    }

    @Bean
    @ConditionalOnMissingBean(SdkPersonTypeApi.class)
    public SdkPersonTypeApi createSdkPersonTypeApi(LunaSdkApiClient apiClient) {
        return apiClient.createSdkPersonTypeApi();
    }

    @Bean
    @ConditionalOnMissingBean(SdkRecognitionApi.class)
    public SdkRecognitionApi createSdkRecognitionApi(LunaSdkApiClient apiClient) {
        return apiClient.createSdkRecognitionApi();
    }

    @Bean
    @ConditionalOnMissingBean(SdkPersonGroupApi.class)
    public SdkPersonGroupApi createSdkPersonGroupApi(LunaSdkApiClient apiClient) {
        return apiClient.createSdkPersonGroupApi();
    }

    @Bean
    @ConditionalOnMissingBean(SdkFileApi.class)
    public SdkFileApi createSdkFileApi(LunaSdkApiClient apiClient) {
        return apiClient.createSdkFileApi();
    }

    @Bean
    @ConditionalOnMissingBean(SdkDeviceSearchApi.class)
    public SdkDeviceSearchApi createSdkDeviceSearchApi(LunaSdkApiClient apiClient) {
        return apiClient.createSdkDeviceSearchApi();
    }

    @Bean
    @ConditionalOnMissingBean(SdkDeviceGroupApi.class)
    public SdkDeviceGroupApi createSdkDeviceGroupApi(LunaSdkApiClient apiClient) {
        return apiClient.createSdkDeviceGroupApi();
    }

    @Bean
    @ConditionalOnMissingBean(SdkDeviceAuthApi.class)
    public SdkDeviceAuthApi createSdkDeviceAuthApi(LunaSdkApiClient apiClient) {
        return apiClient.createSdkDeviceAuthApi();
    }

    @Bean
    @ConditionalOnMissingBean(SdkDeviceApi.class)
    public SdkDeviceApi createSdkDeviceApi(LunaSdkApiClient apiClient) {
        return apiClient.createSdkDeviceApi();
    }

    @Bean
    @ConditionalOnMissingBean(SdkDeviceCommandApi.class)
    public SdkDeviceCommandApi createSdkDeviceCommandApi(LunaSdkApiClient apiClient) {
        return apiClient.createSdkDeviceCommandApi();
    }

    @Bean
    @ConditionalOnMissingBean(SdkPersonFaceApi.class)
    public SdkPersonFaceApi createSdkPersonFaceApi(LunaSdkApiClient apiClient) {
        return apiClient.createSdkPersonFaceApi();
    }

    @Bean
    @ConditionalOnMissingBean(SdkAtdReportApi.class)
    public SdkAtdReportApi createSdkAtdReportApi(LunaSdkApiClient apiClient) {
        return apiClient.createSdkAtdReportApi();
    }

}
