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
//default 默认接口，不需要都实现

    default PageInfo<Member> findMember(int pageNum,int pageSize, String bumen){
        return null;
    }

    default Member findMemberId(int memberid,String membername){
        return null;
    }

    default PageInfo<Member> findTopMember(int pageNum,int pageSize){
        return null;
    }

    default Member findMemberForce(int memberid){
        return null;
    }

    default void upMemberForce(int memberid, Double force){
    }

    default void upAllMember(int memberid,String membername,String password,String bumen,Double force,Integer qx){
    }

    default void addMember(int memberid,String membername,String bumen){
    }

    default void deleteMember(int memberid){}

}
