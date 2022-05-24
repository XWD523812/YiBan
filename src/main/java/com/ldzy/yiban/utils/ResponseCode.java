package com.ldzy.yiban.utils;

public enum ResponseCode {
    SUCCESS(100,"操作成功"),
    ERROR(200,"操作失败"),
    NOT_LOGIN(201,"未登录"),
    NOT_USER_OR_PASSWORD(202,"没用该用户或者密码不对"),
    ERROR_DB(203,"数据库异常"),
    ERROR_USERNAME(204,"用户已存在"),
    ERROR_PARAMS(205,"请求参数格式不对或类型不对或缺失参数项！");

    private int code;
    private String desc;

    ResponseCode(int code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }

    public String getDesc(){
        return desc;
    }

}
