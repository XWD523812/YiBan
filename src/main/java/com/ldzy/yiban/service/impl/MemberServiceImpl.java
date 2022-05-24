package com.ldzy.yiban.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ldzy.yiban.mapper.MemberMapper;
import com.ldzy.yiban.model.Member;
import com.ldzy.yiban.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auction:XWD
 * @Data:2022/5/19
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    public MemberMapper memberMapper;

    @Override
    public Member findMemberId(int id,String membername) {
        return memberMapper.findMemberId(id,membername);
    }

    @Override
    public PageInfo<Member> findMember(int pageNum, int pageSize, String bumen) {
        PageHelper.startPage(pageNum,pageSize);
        List<Member> lists=memberMapper.findMember(bumen);
        return new PageInfo<Member>(lists);
    }

    @Override
    public void upAllMember(int id, String membername, String password, String bumen, Double force, Integer qx) {
        memberMapper.upAllMember(id,membername,password,bumen,force,qx);
    }

    @Override
    public void upMember(int id, Double addForce) {
        memberMapper.upMember(id, addForce);
    }

    @Override
    public void addMember(int id, String membername, String bumen) {
        memberMapper.addMember(id, membername, bumen);
    }

    @Override
    public void deleteMember(int id) {
        memberMapper.deleteMember(id);
    }
}
