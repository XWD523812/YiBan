package com.ldzy.yiban.controller;

import com.ldzy.yiban.model.Member;
import com.ldzy.yiban.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @Auction:XWD
 * @Data:2022/5/25
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */
@Controller
@ResponseBody
@RequestMapping("/log")
public class LogController {

    @Autowired
    public MemberService memberService;

    @PostMapping("/login")
    public Member login(HttpSession session ,int id, String membername, String password){
        Member member = memberService.findMemberId(id,membername);
        if (member.getPassword().equals(password)) {
            session.setAttribute("member",member);
            return member;
        }
        return null;
    }
}