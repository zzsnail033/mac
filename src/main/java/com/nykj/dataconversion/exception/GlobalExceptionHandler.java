package com.nykj.dataconversion.exception;

import com.nykj.dataconversion.codeEnum.ResultEnum;
import com.nykj.dataconversion.response.BodyMsg;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {


    Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 自定义 业务异常
     * @param e
     * @return
     */
    @ExceptionHandler(HospitalException.class)
    Map<String, Object> businessExceptionHandler(HospitalException e) {
        String msg = String.format("异常message:{}, 异常content:{}, 异常errLog: {}", e.getMessage(), e.getContent(), e.getErrLog());
        logger.error(msg);
        return BodyMsg.getInstance().put("code", e.getErrCode()).put("content", e.getContent()).modelMap;
    }

    /**
     * 运行时异常
     * @param e
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    Map<String, Object> runtimeExceptionHandler(RuntimeException e) {
        logger.error("runtime exception: ", e);
        return BodyMsg.getInstance().isFail(e.getMessage()).modelMap;
    }

    /**
     * 空指针异常
     * @param e
     * @return
     */
    @ExceptionHandler(NullPointerException.class)
    Map<String, Object> runtimeExceptionHandler(NullPointerException e) {
        logger.error("runtime exception: ", e);
        return BodyMsg.getInstance().isFail(e.getMessage()).modelMap;
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    Map<String, Object> noHandlerFoundExceptionHandler(NoHandlerFoundException e) {
        logger.error("no handler found exception: ", e);
        return BodyMsg.getInstance().isFail(e.getMessage()).modelMap;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, Object> exception(MethodArgumentNotValidException e) {
        logger.error("runtime exception: ", e);
        BindingResult bindingResult = e.getBindingResult();
        List<ObjectError> allErrors = bindingResult.getAllErrors();
        String infor = "";
        for (ObjectError objectError : allErrors) {
            FieldError fieldError = (FieldError) objectError;
            infor = StringUtils.isBlank(infor) ? (fieldError.getDefaultMessage()) : (infor + "," + fieldError.getDefaultMessage());
        }
        return BodyMsg.getInstance().isFail(infor).put("code", ResultEnum.INVALID_REQ_BODY.getCode()).modelMap;
    }


    @ExceptionHandler(BindException.class)
    public Map<String, Object>  bindExceptionHandler(BindException e) {
        BindingResult bindingResult = e.getBindingResult();
        List<ObjectError> allErrors = bindingResult.getAllErrors();
        String infor = "";
        for (ObjectError objectError : allErrors) {
            FieldError fieldError = (FieldError) objectError;
            infor = StringUtils.isBlank(infor) ? (fieldError.getDefaultMessage()) : (infor + "," + fieldError.getDefaultMessage());
        }
        return BodyMsg.getInstance().isFail(infor).modelMap;
    }


    /**
     * 400 - Bad Request
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ReturnDTO> handleHttpMessageNotReadableException(Exception e) {
        return general(HttpStatus.BAD_REQUEST, e);
    }

    /**
     * 405 - Method Not Allowed
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<ReturnDTO> handleHttpRequestMethodNotSupportedException(Exception e) {
        return general(HttpStatus.METHOD_NOT_ALLOWED, e);
    }

    /**
     * 415 - Unsupported Media Type
     */
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public ResponseEntity<ReturnDTO> handleHttpMediaTypeNotSupportedException(Exception e) {
        return general(HttpStatus.UNSUPPORTED_MEDIA_TYPE, e);
    }

    /**
     * 500 - Internal Server Error
     */
    @ExceptionHandler(Exception.class)
    public Map<String, Object> handleException(Exception e) {
        logger.error(e.getMessage());
        return BodyMsg.getInstance().isFail(e.getMessage()).modelMap;
    }


    /**
     * sql 异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(SQLException.class)
    public Map<String, Object>handleSql(Exception e) {
        return BodyMsg.getInstance().isFail(ResultEnum.SQL_IS_VALID.getMessage())
                .put("code", ResultEnum.SQL_IS_VALID.getCode()).modelMap;
    }

    /**
     * 返回 spring 统一异常 后的信息
     *
     * @param httpStatus
     * @return
     */
    private ResponseEntity<ReturnDTO> general(HttpStatus httpStatus, Exception e) {
        logger.error(e.getMessage(), e);
        return new ResponseEntity(ReturnDTOUtil.custom(httpStatus.value(), httpStatus.name()), httpStatus);
    }

}
