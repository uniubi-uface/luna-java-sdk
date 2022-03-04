package com.uniubi.cloud.luna.sdk.common.exceptioins;

/**
 * com.uniubi.cloud.aiot.sdk.common.exceptioins.UniUbiLunaSdkException
 *
 * @author jingmu
 * @since 2020/3/26
 */
public class UniUbiLunaSdkException extends RuntimeException {

    public UniUbiLunaSdkException() {
    }

    public UniUbiLunaSdkException(String message) {
        super(message);
    }

    public UniUbiLunaSdkException(String message, Throwable cause) {
        super(message, cause);
    }

    public UniUbiLunaSdkException(Throwable cause) {
        super(cause);
    }

    public UniUbiLunaSdkException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
