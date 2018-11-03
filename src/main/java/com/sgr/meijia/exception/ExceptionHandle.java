package com.sgr.meijia.exception;


import com.sgr.meijia.bean.Result;
import com.sgr.meijia.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常捕获
 */

@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger= LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
     public Result handle(Exception e){
        if(e instanceof MyException){
            MyException girlException=(MyException)e
;            return ResultUtil.error(girlException.getCode(),girlException.getMessage());
        }else{
            logger.error("系统异常",e);
            return ResultUtil.error(-1,"未知错误");
        }


       }



}
