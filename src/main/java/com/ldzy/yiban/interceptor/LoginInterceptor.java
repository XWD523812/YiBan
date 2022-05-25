package com.ldzy.yiban.interceptor;

import com.ldzy.yiban.model.Member;
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
        System.out.println("被拦截了");
        HttpSession session = request.getSession();
        //当请求到来时，服务器寻找该浏览器在服务器中是否有session，如果有，则赋值给形参
        //如果没有，则new新的
        Member member =(Member)session.getAttribute("member");
        if (member != null) {//该用户最近登录过
            System.out.println("拦截放行了");
            return true;
        }
        return false;
    }
}
