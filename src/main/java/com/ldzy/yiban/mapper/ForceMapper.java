package com.ldzy.yiban.mapper;
import com.ldzy.yiban.model.Force;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auction:XWD
 * @Data:2022/5/26
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */

@Mapper
@Repository
public interface ForceMapper {

    @Select("SELECT * FROM `force` WHERE forceid = #{forceid}")
    public Force findForce(Force force);

    @Update("UPDATE `force` SET memberid = #{memberid},forceindex = #{forceindex},forceadddata = #{forceadddata} WHERE forceid = #{forceid}")
    public void updateForce(Force force);

    @Insert("INSERT INTO `force`(memberid,forceindex,forceadddata)" +
            "VALUES(#{memberid},#{forceindex},#{forceadddata})")
    public void insertForce(Force force);

    @Delete("DELETE FROM `force` WHERE forceid=#{forceid}")
    public void deleteForce(Force force);

    /**
     *  查询所有日志并分页显示
     * @return
     */
    @Select("SELECT * FROM `force` WHERE memberid = #{memberid} ORDER BY forcedate DESC")
    public List<Force> findMemberForces(int memberid);

    @Select("<script>" +
            "SELECT * FROM `force` " +
            "<where>" +
            "<if test='memberid != null'> memberid = #{memberid} </if>" +
            "</where>" +
            "</script>")
    public List<Force> findForces(@Param(value="memberid")Integer memberid);

}
