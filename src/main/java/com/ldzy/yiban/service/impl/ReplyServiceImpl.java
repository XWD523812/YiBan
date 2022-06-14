package com.ldzy.yiban.service.impl;

import com.ldzy.yiban.mapper.ReplyMapper;
import com.ldzy.yiban.model.Reply;
import com.ldzy.yiban.service.ReplyService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @Auction:XWD
 * @Data:2022/6/14
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */

@Service
public class ReplyServiceImpl implements ReplyService {

    @Resource
    private ReplyMapper replyMapper;

    @Override
    public Reply findReply(Reply reply) {
        return replyMapper.findReply(reply);
    }

    @Override
    public void updateReply(Reply reply) {
        replyMapper.updateReply(reply);
    }

    @Override
    public void insertReply(Reply reply) {
        replyMapper.insertReply(reply);
    }

    @Override
    public void deleteReply(Reply reply) {
        replyMapper.deleteReply(reply);
    }
}
