package com.ldzy.yiban.controller;

import com.github.pagehelper.PageInfo;
import com.ldzy.yiban.model.Force;
import com.ldzy.yiban.model.Member;
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
    public Result<Force> findForce(Force force){
        return Result.success(forceService.findForce(force));
    }

    @PostMapping("/insertForce")
    public Result<Force> insertForce(Force force){
        Member member = new Member();
        member.setMemberid(force.getMemberid());
        member.setForce(force.getForceindex());
        forceService.insertForce(force);
        memberService.updateMember(member);
        return Result.success(forceService.findForce(force));
    }

    @PostMapping("/updateForce")
    public Result<Force> updateMember(Force force){
        forceService.updateForce(force);
        return Result.success(forceService.findForce(force));
    }

    @PostMapping("/deleteForce")
    public Result<Force> deleteMember(Force force){
        forceService.deleteForce(force);
        return Result.success(forceService.findForce(force));
    }

    @PostMapping("/findForces")
    public Result<PageInfo<Force>> findForces(Force force ,int pageNum){
        return Result.success(forceService.findForces(force,pageNum,10));
    }
}
