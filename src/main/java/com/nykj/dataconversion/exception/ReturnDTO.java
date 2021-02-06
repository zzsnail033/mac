package com.nykj.dataconversion.exception;

public class ReturnDTO {
    private int code;
    private String error;
    private Object message;

    public ReturnDTO(int code, String error, Object message) {
        this.code = code;
        this.error = error;
        this.message = message;
    }
    public ReturnDTO(int code, String error) {
        this.code = code;
        this.error = error;
    }

    public ReturnDTO() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
