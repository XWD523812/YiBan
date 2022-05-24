package com.ldzy.yiban.exception;

import com.ldzy.yiban.utils.ResponseCode;

/**
 * @Auction:XWD
 * @Data:2021/12/25
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */


public class LoginException extends Exception{
    private ResponseCode error;

    public ResponseCode getError() {
        return error;
    }

    public LoginException(ResponseCode error){
        super(error.getDesc());
        this.error=error;
    }
}
