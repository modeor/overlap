package com.ingram.overlap.infrastructure.exception;

import org.springframework.http.HttpStatus;

public class SystemException extends RuntimeException {

    private int errorCode;

    private HttpStatus httpStatus;

    public SystemException(ResultCodeEnum resultCode,String message) {
        super(message);
        this.errorCode = resultCode.getErrorCode();
        this.httpStatus = resultCode.getHttpStatus();
    }
}
