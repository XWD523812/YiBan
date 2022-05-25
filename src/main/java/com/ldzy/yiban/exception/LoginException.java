package com.ldzy.yiban.exception;

import com.ldzy.yiban.utils.ResultCode;

/**
 * @Auction:XWD
 * @Data:2021/12/25
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */


public class LoginException extends Exception{
    private ResultCode error;

    public ResultCode getError() {
        return error;
    }

    public LoginException(ResultCode error){
        super(error.getMsg());
        this.error=error;
    }
}
