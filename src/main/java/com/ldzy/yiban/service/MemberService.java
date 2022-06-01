package com.ldzy.yiban.service;


import com.github.pagehelper.PageInfo;
import com.ldzy.yiban.model.Member;
import org.springframework.stereotype.Service;

/**
 * @Auction:XWD
 * @Data:2022/5/12
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */
@Service
public interface MemberService {

    default Member findMember(Member member){
        return null;
    }

    default void updateMember(Member member){
    }

    default void insertMember(Member member){
    }

    default void deleteMember(Member member){}

    default Member findMemberForce(Member member){
        return null;
    }

    default Member findMemberBulletins(Member member){
        return null;
    }

    default PageInfo<Member> findMembers( Member member ,int pageNum ,int pageSize){
        return null;
    }
}
