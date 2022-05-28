package com.ldzy.yiban.controller;

import com.github.pagehelper.PageInfo;
import com.ldzy.yiban.model.Force;
import com.ldzy.yiban.service.ForceService;
import com.ldzy.yiban.service.MemberService;
import com.ldzy.yiban.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auction:XWD
 * @Data:2022/5/26
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */

@Controller
@ResponseBody
@RequestMapping("/force")
public class ForceController {

    @Autowired
    private ForceService forceService;

    @Autowired
    private MemberService memberService;

    @PostMapping("/findForce")
    public PageInfo<Force> findForces(int pageNum){
        PageInfo<Force> pageInfo =  forceService.findForce(pageNum,10);
        return pageInfo;
    }

    @PostMapping("/addForce")
    public Result<Force> addMember(int memberid, Double forceindex, String forceadddata){
        forceService.addForce(memberid,forceindex,forceadddata);
        memberService.upMemberForce(memberid,forceindex);
        return Result.success();
    }

    @PostMapping("/upForce")
    public Result<Force> upMember(int memberid, Double forceindex, String forceadddata){
        forceService.addForce(memberid,forceindex,forceadddata);
        memberService.upMemberForce(memberid,forceindex);
        return Result.success();
    }

    @PostMapping("/deleteForce")
    public Result<Force> deleteMember(int memberid, Double forceindex, String forceadddata){
        forceService.addForce(memberid,forceindex,forceadddata);
        memberService.upMemberForce(memberid,forceindex);
        return Result.success();
    }
}
