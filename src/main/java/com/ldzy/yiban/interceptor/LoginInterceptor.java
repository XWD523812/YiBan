package com.ldzy.yiban.interceptor;

import com.ldzy.yiban.exception.LoginException;
import com.ldzy.yiban.model.Member;
import com.ldzy.yiban.utils.ResultCode;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Auction:XWD
 * @Data:2022/5/12
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        //当请求到来时，服务器寻找该浏览器在服务器中是否有session，如果有，则赋值给形参
        //如果没有，则new新的
        Member member =(Member)session.getAttribute("member");
        if (member != null) {//该用户最近登录过
            return true;
        }

        try {
            int i=1/0;
        }catch (Exception e){
           throw new LoginException(ResultCode.NOT_LOGIN);
        }
        //重定向到登录页面 前后端分离一般使用json数据返回
        //response.sendRedirect("https://www.baidu.com/");
        return false;
    }
}
