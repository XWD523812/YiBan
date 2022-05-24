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

    default void upAllMember(int id,String membername,String password,String bumen,Double force,Integer qx){
    }

    default PageInfo<Member> findMember(int pageNum,int pageSize, String bumen){
        return null;
    }

    default Member findMemberId(int id,String membername){
        return null;
    }

    default PageInfo<Member> findTopMember(int pageNum,int pageSize){
        return null;
    }

    default void upMember(int id, Double addForce){
    }

    default void addMember(int id,String membername,String bumen){
    }

    default void deleteMember(int id){}
}
