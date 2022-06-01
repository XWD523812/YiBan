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
    public Member findMember(Member member) {
        return memberMapper.findMember(member);
    }

    @Override
    public void updateMember(Member member) {
        memberMapper.updateMember(member);
    }

    @Override
    public void insertMember(Member member) {
        memberMapper.insertMember(member);
    }

    @Override
    public void deleteMember(Member member) {
        memberMapper.deleteMember(member);
    }

    @Override
    public PageInfo<Member> findMembers(Member member ,int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Member> lists=memberMapper.findMembers(member);
        return new PageInfo<Member>(lists);
    }

    @Override
    public Member findMemberForce(Member member) {
        return memberMapper.findMemberForce(member);
    }

}
