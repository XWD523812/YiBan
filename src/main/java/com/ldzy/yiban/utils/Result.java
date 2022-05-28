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

    public Result(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    //成功返回结果
    public static <T> Result<T> success(){
        return new Result<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg());
    }
    //成功返回结果 data 获取的数据
    public static <T> Result<T> success(T data){
        return new Result<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), data);
    }
    //成功返回结果 data 获取的数据  msg 提示信息
    public static <T> Result<T> success(T data,String msg){
        return new Result<T>(ResultCode.SUCCESS.getCode(), msg,data);
    }
    //失败返回提示信息
    public static <T> Result<T> failed() {
        return failed(ResultCode.ERROR.getMsg());
    }
    //失败返回结果
    public static <T> Result<T> failed(ErrorCode errorCode) {
        return new Result<T>(errorCode.getCode(), errorCode.getMsg());
    }
    //失败返回结果 提示信息
    public static <T> Result<T> failed(String msg) {
        return new Result<T>(ResultCode.ERROR.getCode(), msg);
    }
    //数据库异常
    public static <T> Result<T> errorDB(T data) {
        return new Result<T>(ResultCode.ERROR_DB.getCode(), ResultCode.ERROR_DB.getMsg(),data);
    //服务器内部错误
    }
    public static <T> Result<T> errorWebYB(T data) {
        return new Result<T>(ResultCode.ERROR_WEB_YB.getCode(), ResultCode.ERROR_WEB_YB.getMsg(),data);
    }

    //未登录
    public static <T> Result<T> noLogin() {
        return new Result<T>(ResultCode.NOT_LOGIN.getCode(), ResultCode.NOT_LOGIN.getMsg());
    }
    //没用该用户或者密码不对
    public static <T> Result<T> noUserOrPassword() {
        return new Result<T>(ResultCode.NOT_USER_OR_PASSWORD.getCode(), ResultCode.NOT_USER_OR_PASSWORD.getMsg());
    }
    //数据有重复
    public static <T> Result<T> errorNameOrId() {
        return new Result<T>(ResultCode.ERROR_NAME_OR_ID.getCode(), ResultCode.ERROR_NAME_OR_ID.getMsg());
    }
    //用户名长度超出
    public static <T> Result<T> errorUsernameLong() {
        return new Result<T>(ResultCode.ERROR_USER_LONG.getCode(), ResultCode.ERROR_USER_LONG.getMsg());
    }
    //注册用户名已存在
    public static <T> Result<T> errorUsername() {
        return new Result<T>(ResultCode.ERROR_USER.getCode(), ResultCode.ERROR_USER.getMsg());
    }
    //请求参数格式不对或类型不对或缺失参数项
    public static <T> Result<T> errorParams() {
        return new Result<T>(ResultCode.ERROR_PARAMS.getCode(), ResultCode.ERROR_PARAMS.getMsg());
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
