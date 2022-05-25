package com.ldzy.yiban.utils;


public enum ResultCode implements ErrorCode{
    SUCCESS(100,"操作成功"),
    ERROR(200,"操作失败"),
    NOT_LOGIN(201,"未登录"),
    NOT_USER_OR_PASSWORD(202,"没用该用户或者密码不对"),
    ERROR_NAME(203,"有重名的现象，请使用id进行登录"),
    ERROR_DB(204,"数据库异常"),
    ERROR_USERNAME(205,"用户已存在"),
    ERROR_PARAMS(206,"请求参数格式不对或类型不对或缺失参数项！");

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