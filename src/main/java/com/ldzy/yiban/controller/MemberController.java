package com.ldzy.yiban.controller;

import com.github.pagehelper.PageInfo;
import com.ldzy.yiban.model.Member;
import com.ldzy.yiban.service.MemberService;
import com.ldzy.yiban.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Auction:XWD
 * @Data:2022/5/12
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */
@Controller
@ResponseBody
@RequestMapping("/member")
public class MemberController {
    @Autowired
    public MemberService memberService;

    @PostMapping("/findMember")
    public Result<Member> findMember(Member member){
        return Result.success(memberService.findMember(member));
    }

    @PostMapping("/updateMember")
    public Result<Member> updateMember(Member member){
        memberService.updateMember(member);
        return Result.success(memberService.findMember(member));
    }

    @PostMapping("/insertMember")
    public Result<Member> insertMember(Member member){
        memberService.insertMember(member);
        return Result.success(memberService.findMember(member));
    }

    @PostMapping("/deleteMember")
    public Result<Member> deleteMember( Member member){
        memberService.deleteMember(member);
        return Result.success(member);
    }

    @PostMapping("/findMembers")
    public Result<PageInfo<Member>> findMembers(Member member ,@RequestParam(defaultValue = "1") Integer pageNum){
        PageInfo<Member> queryResult = memberService.findMembers(member,pageNum,10); // pageNum:当前页码数，第一次进来时默认为1（首页）
        return Result.success(queryResult);
    }

    @PostMapping("/findMemberForce")
    public Result<Member> findMemberForce( Member memberid){
        return Result.success(memberService.findMemberForce(memberid));

    }

}
