package com.ldzy.yiban.utils;


public enum ResultCode implements ErrorCode{
    SUCCESS(2000,"操作成功"),
    ERROR(3000,"操作失败"),
    ERROR_DB(4000,"数据库异常"),
    NOT_LOGIN(4001,"未登录"),
    NOT_USER_OR_PASSWORD(4002,"用户名或者密码不对"),
    ERROR_NAME_OR_ID(4003,"有重名的现象，请使用id进行登录"),
    ERROR_USER_LONG(4004,"用户名长度最多为五个字"),
    ERROR_USER(4005,"用户已存在"),
    ERROR_PARAMS(4006,"请求参数格式不对或类型不对或缺失参数项！"),
    ERROR_WEB_YB(5000,"服务器内部错误！");

    private int code;
    private String msg;

    ResultCode() {
    }

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode(){
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }


}
