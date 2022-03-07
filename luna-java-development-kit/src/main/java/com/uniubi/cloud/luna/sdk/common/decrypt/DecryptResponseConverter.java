package com.uniubi.cloud.luna.sdk.common.decrypt;

import com.alibaba.fastjson.JSONObject;
import com.uniubi.cloud.luna.sdk.common.encrypt.LunaDevelopEncrypt;
import com.uniubi.cloud.luna.sdk.common.exceptioins.UniUbiLunaSdkException;
import com.uniubi.cloud.luna.sdk.common.models.SdkResult;
import com.uniubi.cloud.luna.sdk.common.type.TypeHandlerRegistry;
import com.uniubi.cloud.luna.sdk.http.defaults.DefaultResponseConverter;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 公钥解密响应处理器
 *
 * @author jingmu
 * @since 2020/6/9
 */
public class DecryptResponseConverter extends DefaultResponseConverter {

    private final String publicKey;

    public DecryptResponseConverter(String publicKey) {
        this.publicKey = publicKey;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T converter(String responseContent, Type classType) {
        ContentResult contentResult = JSONObject.parseObject(responseContent, ContentResult.class);
        String encryptData = (String) contentResult.getData();
        if (StringUtils.isEmpty(encryptData) || StringUtils.isEmpty(contentResult.secret)) {
            return super.converter(responseContent, classType);
        }
        try {
            Type[] typeArguments = ((ParameterizedType) classType).getActualTypeArguments();
            if (typeArguments == null || typeArguments.length == 0) {
                contentResult.setSecret(null);
                return (T) contentResult;
            }
            // 第一步使用公钥给口令解密
            String aesKey = LunaDevelopEncrypt.decryptByPublicKey(contentResult.secret, publicKey);
            // 第二步使用口令解密数据内容
            responseContent = LunaDevelopEncrypt.decryptByAes(aesKey, encryptData);
            Object result = TypeHandlerRegistry.getObject(responseContent, typeArguments[0]);
            contentResult.setData(result);
            contentResult.setSecret(null);
            return (T) contentResult;
        }
        catch (Exception e) {
            throw new UniUbiLunaSdkException(e);
        }
    }

    /**
     * ContentResult
     */
    public static class ContentResult extends SdkResult {

        private String secret;

        public String getSecret() {
            return secret;
        }

        public void setSecret(String secret) {
            this.secret = secret;
        }

        @Override
        public String toString() {
            return "ContentResult{" + "secret='" + secret + '\'' + '}';
        }

    }

}
