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
@RequestMapping("/member")
public class MemberController {
    @Autowired
    public MemberService memberService;

    @PostMapping("/findID")
    @ResponseBody
    public Member findMemberId(int id,String membername){
        Member member = memberService.findMemberId(id,membername);
        return member;
    }

    @PostMapping("/findMember")
    @ResponseBody
    public PageInfo<Member> findMember(@RequestParam(defaultValue = "1") Integer pageNum, String bumen){
        PageInfo<Member> queryResult = memberService.findMember(pageNum,10,bumen); // pageNum:当前页码数，第一次进来时默认为1（首页）
        return queryResult;
    }

    @PostMapping("/findTopMember")
    @ResponseBody
    public PageInfo<Member> findTopMember(@RequestParam(defaultValue = "1") Integer pageNum){
        PageInfo<Member> queryResult = memberService.findTopMember(pageNum,10);// pageNum:当前页码数，第一次进来时默认为1（首页）
        return queryResult;
    }

    @PostMapping("/upMember")
    @ResponseBody
    public Member upMember(int id,String membername,Double addForce){
        memberService.upMember(id,addForce);
        return memberService.findMemberId(id,membername);
    }

    @PostMapping("/upAllMember")
    @ResponseBody
    public Member upAllMember(int id, String membername, String password, String bumen,@RequestParam(defaultValue = "0") Double force, Integer qx){
        memberService.upAllMember(id,membername,password,bumen,force,qx);
        System.out.println(id+membername+password+bumen+force+qx);
        return memberService.findMemberId(id,membername);
    }

    @PostMapping("/addMember")
    @ResponseBody
    public Member addMember(int id,String membername,String bumen) throws Exception{
        memberService.addMember(id,membername,bumen);
        return memberService.findMemberId(id,membername);
    }

    @PostMapping("/deleteMember")
    @ResponseBody
    public void deleteMember(int id){
        memberService.deleteMember(id);
    }
}
