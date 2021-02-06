package com.nykj.dataconversion.exception;


import com.nykj.dataconversion.codeEnum.ResultEnum;

public class HospitalException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public HospitalException() {
        super();
    }

    private String errCode;

    private String content;

    private String method;

    private String className;

    private String errLog;


    public HospitalException(String message) {
        super(message);
    }


    public HospitalException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.setErrCode(String.valueOf(resultEnum.getCode()));
    }

    public HospitalException(String message, Throwable cause) {
        super(message, cause);
    }

    public HospitalException(Throwable cause) {
        super(cause);
    }

    protected HospitalException(String message, Throwable cause,
								boolean enableSuppression,
								boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getErrCode() {
        return errCode;
    }

    public HospitalException setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }

    public String getContent() {
        return content;
    }

    public HospitalException setContent(String content) {
        this.content = content;
        return this;
    }

    public String getMethod() {
        return method;

    }

    public HospitalException setMethod(String method) {
        this.method = method;
        return this;
    }

    public String getClassName() {
        return className;
    }

    public HospitalException setClassName(String className) {
        this.className = className;
        return this;
    }

    public String getErrLog() {
        return errLog;
    }

    public HospitalException setErrLog(String errLog) {
        this.errLog = errLog;
        return this;
    }
}
