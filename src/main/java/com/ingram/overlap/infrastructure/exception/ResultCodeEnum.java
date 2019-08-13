package com.ingram.overlap.infrastructure.exception;

import org.springframework.http.HttpStatus;

public enum ResultCodeEnum {

    SUCCESS(0, HttpStatus.OK),

    USER_NOT_FOUND(1001, HttpStatus.NOT_FOUND);

    private int errorCode;
    private HttpStatus httpStatus;

    ResultCodeEnum(int errorCode, HttpStatus httpStatus) {
        this.errorCode = errorCode;
        this.httpStatus = httpStatus;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}


