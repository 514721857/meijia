package com.sgr.meijia.enums;

public enum ResultEnum {
    UNKNOWN_ERROE(-1,"未知错误"),
    SUCCESS(0,"成功"),
    TOKEN_ERROE_COOKIE(2,"token失效,cookie"),
    TOKEN_ERROE_REDIS(3,"token失效,reids"),
    TOKEN_ERROE_HAVE(4,"已经在其他设备登录"),
    LOGIN_ERROE(5,"账号或者密码错误");


    private Integer code;
    private  String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
