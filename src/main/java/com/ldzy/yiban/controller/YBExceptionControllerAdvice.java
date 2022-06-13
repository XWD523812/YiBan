package com.ldzy.yiban.controller;

import com.ldzy.yiban.exception.LoginException;
import com.ldzy.yiban.utils.Result;
import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auction:XWD
 * @Data:2022/5/27
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */
@ControllerAdvice
@ResponseBody
public class YBExceptionControllerAdvice {
    private static final Logger log = LoggerFactory.getLogger(YBExceptionControllerAdvice.class);

    @ExceptionHandler(value = Exception.class)
    public Result<String> exceptionHandler(Exception e){
        System.out.println("未知异常！原因是:"+e);
        return Result.errorWebYB(e.getMessage());
    }

    @ExceptionHandler(value = BindException.class)
    public Result<String> bindHandle(Exception e) {
        return Result.errorParams("请求参数校验未通过！原因是："+e);
    }

    @ExceptionHandler(value = MyBatisSystemException.class)
    public Result<String> myBatisSystemExceptionHandle(Exception e) {
        System.out.println("数据库异常。MyBatis映射失败 原因是："+e);
        return Result.errorDB("数据库异常。"+e);
    }

    @ExceptionHandler(value = DuplicateKeyException.class)
    public Result<String> duplicateKeyExceptionHandle(Exception e) {
        System.out.println("数据库异常。唯一键值不能重复！"+e);
        return Result.errorUsername("用户已存在！"+e);
    }

    @ExceptionHandler(value = LoginException.class)
    public Result<String> loginExceptionHandle(Exception e) {
        System.out.println("访问失败。未登录！"+e);
        return Result.noLogin("访问失败。未登录！"+e);
    }

    @ExceptionHandler(value = MysqlDataTruncation.class)
    public Result<String>zhuCeExceptionHandle(Exception e) {
        System.out.println("数据库异常。数据长度超出！"+e);
        return Result.errorUsernameLong("用户名长度最多为七个字！"+e);
    }

}
