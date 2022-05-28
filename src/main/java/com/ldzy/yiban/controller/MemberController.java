package com.ldzy.yiban.controller;

import com.github.pagehelper.PageInfo;
import com.ldzy.yiban.model.Member;
import com.ldzy.yiban.service.MemberService;
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

    @PostMapping("/findID")
    public Member findMemberId(int memberid,String membername){
        Member member = memberService.findMemberId(memberid,membername);
        return member;
    }

    @PostMapping("/findMember")
    public PageInfo<Member> findMember(@RequestParam(defaultValue = "1") Integer pageNum, String bumen){
        PageInfo<Member> queryResult = memberService.findMember(pageNum,10,bumen); // pageNum:当前页码数，第一次进来时默认为1（首页）
        return queryResult;
    }

    @PostMapping("/findTopMember")
    public PageInfo<Member> findTopMember(@RequestParam(defaultValue = "1") Integer pageNum){
        PageInfo<Member> queryResult = memberService.findTopMember(pageNum,10);// pageNum:当前页码数，第一次进来时默认为1（首页）
        return queryResult;
    }

    @PostMapping("/findMemberForce")
    public Member findMemberForce(int memberid){
        Member member = memberService.findMemberForce(memberid);
        return member;
    }

    @PostMapping("/upMemberForce")
    public Member upMember(int memberid,String membername,Double force){
        memberService.upMemberForce(memberid,force);
        return memberService.findMemberId(memberid,membername);
    }

    @PostMapping("/upAllMember")
    public Member upAllMember(int memberid, String membername, String password, String bumen,@RequestParam(defaultValue = "0") Double force, Integer qx){
        memberService.upAllMember(memberid,membername,password,bumen,force,qx);
        return memberService.findMemberId(memberid,membername);
    }

    @PostMapping("/addMember")
    public Member addMember(int memberid,String membername,String bumen) throws Exception{
        memberService.addMember(memberid,membername,bumen);
        return memberService.findMemberId(memberid,membername);
    }

    @PostMapping("/deleteMember")
    public void deleteMember(int memberid){
        memberService.deleteMember(memberid);
    }
}
