package com.example.result.Result;

/**
 * Created by SunArmy on 2018/11/20.
 */
public class ResponseResult {
    private String code = "200";
    private  String msg = "成功";
    private Object data;

    public ResponseResult() {
    }

    public ResponseResult(String code) {
        this.code = code;
        this.msg = "失败";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public ResponseResult setData(Object data) {
        this.data = data;
        return this;
    }
}
