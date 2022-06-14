package com.ldzy.yiban.service;

import com.ldzy.yiban.model.Reply;
import org.springframework.stereotype.Service;

/**
 * @Auction:XWD
 * @Data:2022/6/14
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */
@Service
public interface ReplyService {

    default Reply findReply(Reply reply){
        return null;
    }

    default void updateReply(Reply reply){
    }

    default void insertReply(Reply reply){}

    default void deleteReply(Reply reply){}

}
