package com.ldzy.yiban.mapper;

import com.ldzy.yiban.model.Force;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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

    @Select("SELECT * FROM force_index")
    public List<Force> findForce();

    @Insert("INSERT INTO force_index(memberid,forceindex,forceadddata)" +
            "VALUES(#{memberid},#(forceindex),#{forceadddata})")
    public void addForce(int memberid, int forceindex, String forceadddata);

}
