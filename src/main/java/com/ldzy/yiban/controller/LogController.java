package com.ldzy.yiban.controller;

import com.ldzy.yiban.model.Member;
import com.ldzy.yiban.service.MemberService;
import com.ldzy.yiban.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

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
    public Result<Member> login(HttpSession session ,@Valid Member memberLogin)  {

        //通过id或姓名来登录
        Member member = memberService.findMember(memberLogin);
        if (member == null) {
            return Result.noUser(memberLogin);
        }
        if (member.getPassword().equals(memberLogin.getPassword()) && member.getQx() <= memberLogin.getQx()) {
            //新建一个session用于登录控制
            session.setAttribute("member",member);
            return Result.success(member);
        }
        return Result.noPassword(memberLogin);
    }

    @PostMapping("/logout")
    public Result<String> logout(HttpSession session){
        session.removeAttribute("member");
        return Result.success("已退出登录");
    }

}