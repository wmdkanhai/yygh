package com.wmding.yygh.common.util.exception;

import com.wmding.yygh.common.util.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 明月
 * @version 1.0
 * @date 9/5/21 1:11 PM
 * @description: 统一异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e) {
        e.printStackTrace();
        return Result.fail();
    }

    @ExceptionHandler(YyghException.class)
    @ResponseBody
    public Result error(YyghException e) {
        e.printStackTrace();
        return Result.build(e.getCode(), e.getMessage());
    }
}
