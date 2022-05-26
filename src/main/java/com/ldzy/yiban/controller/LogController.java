package com.ldzy.yiban.controller;

import com.ldzy.yiban.model.Member;
import com.ldzy.yiban.service.MemberService;
import com.ldzy.yiban.utils.Result;
import com.ldzy.yiban.utils.ResultCode;
import org.apache.ibatis.jdbc.Null;
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
    public Result<Member> login(HttpSession session ,int id, String membername, String password)  {
        //通过id或姓名来登录
        Member member = memberService.findMemberId(id,membername);
        if (member.getPassword().equals(password)) {
            //新建一个session用于登录控制
            session.setAttribute("member",member);
            return Result.success(member);
        }
        return Result.errorName(null);
    }

    @PostMapping("/logout")
    public Result<String> logout(HttpSession session){
        session.removeAttribute("member");
        return Result.success("已退出登录");
    }

}