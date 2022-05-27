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

    //查询所有日志并分页显示
    @Select("SELECT * FROM force_index")
    public List<Force> findForce();

    @Update("UPDATE force_index SET memberid=#{memberid},forceindex=#(forceindex),forceadddata=#{forceadddata} WHERE forceid=#{forceid}")
    public void upForce(int memberid, int forceindex, String forceadddata);

    //插入一条数据
    @Insert("INSERT INTO force_index(memberid,forceindex,forceadddata)" +
            "VALUES(#{memberid},#(forceindex),#{forceadddata})")
    public void addForce(@Param("memberid") Integer memberid,@Param("forceindex") Integer forceindex,@Param("forceadddata") String forceadddata);


}
