package com.sgr.meijia.exception;


import com.sgr.meijia.enums.ResultEnum;

public class MyException extends RuntimeException{
      private Integer code;

    public MyException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
