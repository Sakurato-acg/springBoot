package com.itheima.exception;

import com.itheima.controller.Code;
import com.itheima.controller.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@RestControllerAdvice用于标识当前类为REST风格对应的异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //除了自定义的异常处理器，保留对Exception类型的异常处理，用于处理非预期的异常


    //系统异常
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex) {
        //记录日志
        //发送信息给运维
        //发送邮件给开发人员
        System.out.println(ex.getMessage());
        return new Result(ex.getCode(), null, ex.getMessage());
    }

    //业务异常
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex) {
        //记录日志
        //发送信息给运维
        //发送邮件给开发人员
        System.out.println(ex.getMessage());
        return new Result(ex.getCode(), null, ex.getMessage());
    }

    //其他异常
    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex) {
        System.out.println(ex.getMessage());
        return new Result(Code.SYSTEM_UNKNOWN_ERR, null, ex.getMessage());
    }
}
