package com.ldzy.yiban.controller;

import com.ldzy.yiban.model.Reply;
import com.ldzy.yiban.service.ReplyService;
import com.ldzy.yiban.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auction:XWD
 * @Data:2022/6/14
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */

@Controller
@ResponseBody
@RequestMapping("/reply")
public class ReplyController {

    @Autowired
    private ReplyService replyService;

    @PostMapping("/findReply")
    public Result<Reply> findForce(Reply reply){
        return Result.success(replyService.findReply(reply));
    }

    @PostMapping("/updateReply")
    public Result<Reply> updateReply(Reply reply){
        replyService.updateReply(reply);
        return Result.success(replyService.findReply(reply));
    }

    @PostMapping("/insertReply")
    public Result<Reply> insertReply(Reply reply){
        replyService.insertReply(reply);
        return Result.success(replyService.findReply(reply));
    }

    @PostMapping("/deleteReply")
    public Result<Reply> deleteReply(Reply reply){
        replyService.deleteReply(reply);
        return Result.success(replyService.findReply(reply));
    }

}
