package com.ldzy.yiban.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ldzy.yiban.mapper.ForceMapper;
import com.ldzy.yiban.model.Force;
import com.ldzy.yiban.model.Member;
import com.ldzy.yiban.service.ForceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auction:XWD
 * @Data:2022/5/26
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */
@Service
public class ForceServiceImpl implements ForceService {

    @Resource
    private ForceMapper forceMapper;

    @Override
    public PageInfo<Force> findForce(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Force> lists=forceMapper.findForce();
        return new PageInfo<Force>(lists);
    }

    @Override
    public void addForce(int memberid, int forceindex, String forceadddata) {
        forceMapper.addForce(memberid,forceindex,forceadddata);
    }
}
