package com.bimda.cdshproject.service.exception;

/**
 * @PACKAGE_NAME: com.bimda.cdshproject.service.exception
 * @NAME: ApiException
 * @USER: Han
 * @DATE: 2020/11/12
 * @TIME: 14:26
 * @DAY_NAME_SHORT: 周四
 * @PROJECT_NAME: cdsh-project
 * @Desc:
 */
public class ApiException extends RuntimeException {
    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }
}
