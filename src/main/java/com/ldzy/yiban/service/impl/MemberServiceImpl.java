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
    public Member findMemberId(int memberid,String membername) {
        return memberMapper.findMemberId(memberid,membername);
    }

    @Override
    public PageInfo<Member> findMember(int pageNum, int pageSize, String bumen) {
        PageHelper.startPage(pageNum,pageSize);
        List<Member> lists=memberMapper.findMember(bumen);
        return new PageInfo<Member>(lists);
    }

    @Override
    public PageInfo<Member> findTopMember(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Member> lists = memberMapper.findTopMember();
        return new PageInfo<Member>(lists);
    }

    @Override
    public Member findMemberForce(int memberid) {
        return memberMapper.findMemberForce(memberid);
    }

    @Override
    public void upAllMember(int memberid, String membername, String password, String bumen, Double force, Integer qx) {
        memberMapper.upAllMember(memberid,membername,password,bumen,force,qx);
    }

    @Override
    public void upMemberForce(int memberid, Double force) {
        memberMapper.upMemberForce(memberid, force);
    }

    @Override
    public void addMember(int memberid, String membername, String bumen) {
        memberMapper.addMember(memberid, membername, bumen);
    }

    @Override
    public void deleteMember(int memberid) {
        memberMapper.deleteMember(memberid);
    }
}
