package com.ldzy.yiban.utils;

/**
 * @Auction:XWD
 * @Data:2022/5/25
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    public Result() {
    }

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    //成功返回结果 data 获取的数据
    public static <T> Result<T> success(T data){
        return new Result<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), data);
    }
    //成功返回结果 data 获取的数据  msg 提示信息
    public static <T> Result<T> success(T data,String msg){
        return new Result<T>(ResultCode.SUCCESS.getCode(), msg,data);
    }
    //失败返回结果 提示信息
    public static <T> Result<T> failed(String message) {
        return new Result<T>(ResultCode.ERROR.getCode(), message, null);
    }
    //失败返回结果
    public static <T> Result<T> failed() {
        return failed(ResultCode.ERROR.getMsg());
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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
