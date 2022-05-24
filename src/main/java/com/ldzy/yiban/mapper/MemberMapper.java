package com.ldzy.yiban.mapper;

import com.ldzy.yiban.model.Member;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auction:XWD
 * @Data:2022/5/12
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */

@Repository
@Mapper
public interface MemberMapper {

    //根据姓名或者id查询所有  需要权限<=0
    @Select("<script>" +
            "SELECT * from member" +
            "<where>" +
            "<if test='membername!=null'> membername=#{membername} </if>" +
            "<if test='membername==null and id!=null'> memberid=#{id} </if>" +
            "</where>" +
            "</script>" )
    public Member findMemberId(int id,String membername);

    //查询所有信息 需要顶级权限 qx=0
    @Select("SELECT * from member")
    public List<Member> findTopMember();

    //查询所有 编号，姓名，部门，战力  不需要权限
    @Select("<script>" +
            "SELECT memberid,membername,bumen,`force` FROM member" +
            "<if test='bumen!=null'> WHERE bumen=#{bumen} </if>" +
            " ORDER BY `force` DESC" +
            "</script>")
    public List<Member> findMember(@Param("bumen") String bumen);

    //修改所有 需要权限=0
    @Update("<script>" +
            "update member" +
            "<set>" +
            "<if test='membername!=null'> membername=#{membername}, </if>" +
            "<if test='password!=null'> password=#{password}, </if>" +
            "<if test='bumen!=null'> bumen=#{bumen}, </if>" +
            "<if test='qx!=null'> qx=#{qx}, </if>" +
            "<if test='force!=null'>`force`=`force`+#{force}, </if>" +
            "</set>" +
            "where memberid=#{id}" +
            "</script>")
    public void upAllMember(int id,String membername,String password,String bumen,Double force,Integer qx);
    //动态sql  修改成员信息

    //根据id刷新总战力 需要管理员权限及以上 qx<=1
    @Select("UPDATE member SET `force`=`force`+#{addForce} WHERE memberid=#{id}")
    public void upMember(int id,Double addForce);

    //插入一条数据 需要qx<=1
    @Insert("INSERT INTO member(memberid,membername,bumen)" +
            "VALUES(#{memberid},#{membername},#{bumen})")
    public void addMember(@Param("memberid") int id,@Param("membername") String membername,@Param("bumen") String bumen);

    //删除一条数据 需要qx<=1 且被删除人的qx<执行人的qx
    @Delete("DELETE FROM member WHERE memberid=#{id}")
    public void deleteMember(int id);
}
