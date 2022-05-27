package com.ldzy.yiban.controller;

import com.github.pagehelper.PageInfo;
import com.ldzy.yiban.model.Force;
import com.ldzy.yiban.model.Member;
import com.ldzy.yiban.service.ForceService;
import com.ldzy.yiban.utils.Result;
import com.ldzy.yiban.utils.ResultCode;
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

    @PostMapping("/findForce")
    public PageInfo<Force> findForces(int pageNum){
        PageInfo<Force> pageInfo =  forceService.findForce(pageNum,10);
        return pageInfo;
    }

    @PostMapping("/addForce")
    public Result<String> addMember(Integer memberid, Integer forceindex, String forceadddata){
            forceService.addForce(memberid,forceindex,forceadddata);
            return Result.success("操作成功，日志已添加");
    }



}
