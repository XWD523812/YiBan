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

    //根据姓名或者id查询所有  需要本人或者权限<=0
    @Select("<script>" +
            "SELECT * from member" +
            "<where>" +
            "<if test='membername!=null'> membername=#{membername} </if>" +
            "<if test='membername==null and memberid!=null'> memberid=#{memberid} </if>" +
            "</where>" +
            "</script>" )
    public Member findMemberId(int memberid,String membername);

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

    //column	为数据库字段名，
    //property	为实体类属性名，
    //jdbcType	为数据库字段数据类型，
    //id	为是否为主键
    //one 表示这是一个一对一的查询
    //@One(select = "方法全路径) 表示我们调用的方法
    //根据id查询战力值，包括战力日志
    @Select("SELECT memberid,membername,bumen,`force` FROM member WHERE memberid=#{memberid}")
    @Results(id = "forceMap" , value = {
            @Result(column = "memberid",property = "memberid"),
            @Result(column = "memberid",property = "forces",
            many = @Many(select = "com.ldzy.yiban.mapper.ForceMapper.findForceID")
            )
    })
    public Member findMemberForce(int memberid);

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
            "where memberid=#{memberid}" +
            "</script>")
    public void upAllMember(int memberid,String membername,String password,String bumen,Double force,Integer qx);
    //动态sql  修改成员信息

    //根据id刷新总战力 不设控制器，由force控制器调用 需要管理员权限及以上 qx<=1
    @Update("UPDATE member SET `force`=`force`+#{force} WHERE memberid=#{memberid}")
    public void upMemberForce(int memberid,Double force);

    //插入一条数据 需要qx<=1
    @Insert("INSERT INTO member(memberid,membername,bumen)" +
            "VALUES(#{memberid},#{membername},#{bumen})")
    public void addMember(@Param("memberid") int memberid,@Param("membername") String membername,@Param("bumen") String bumen);

    //删除一条数据 需要qx<=1 且被删除人的qx<执行人的qx
    @Delete("DELETE FROM member WHERE memberid=#{memberid}")
    public void deleteMember(int memberid);
}
