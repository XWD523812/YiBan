package com.ldzy.yiban.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ldzy.yiban.mapper.ForceMapper;
import com.ldzy.yiban.model.Force;
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
    public Force findForce(Force force) {
        return forceMapper.findForce(force);
    }

    @Override
    public void updateForce(Force force) {
        forceMapper.updateForce(force);
    }

    @Override
    public void insertForce(Force force) {
        forceMapper.insertForce(force);
    }


    @Override
    public void deleteForce(Force force) {
        forceMapper.deleteForce(force);
    }

    @Override
    public PageInfo<Force> findForces(Force force ,int pageNum ,int pageSize) {
        Integer memberid = force.getMemberid();
        PageHelper.startPage(pageNum,pageSize);
        List<Force> lists=forceMapper.findForces(memberid);
        return new PageInfo<Force>(lists);
    }

}
