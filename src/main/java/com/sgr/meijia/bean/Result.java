package com.sgr.meijia.bean;

import java.io.Serializable;

public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1862906644681971100L;
    /**
     * 统一请求  最外层
     */
    Integer code;//错误码
    String msg;//信息
    T data;//内容

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
