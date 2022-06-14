package com.ldzy.yiban.mapper;

import com.ldzy.yiban.model.Reply;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auction:XWD
 * @Data:2022/6/14
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */

@Mapper
@Repository
public interface ReplyMapper {


    @Select("SELECT * FROM `reply` WHERE replyid = #{replyid} AND replystate=0")
    public Reply findReply(Reply reply);

    @Update("<script>" +
            "UPDATE `reply` " +
            "<set>" +
            "<if test = 'replystate != null'> replystate = #{replystate}, </if>" +
            "</set>" +
            "WHERE replyid = #{replyid}" +
            "</script>")
    public void updateReply(Reply reply);

    @Insert("INSERT INTO `reply`(memberid,bulletinid,replybody)" +
            "VALUES(#{memberid},#{bulletinid},#{replybody})")
    public void insertReply(Reply reply);

    @Delete("DELETE FROM `reply` WHERE replyid=#{replyid}")
    public void deleteReply(Reply reply);

    /**
     *  一对多查询，将List对象集合传给Bulletin对象
     * @return
     */
    @Select("SELECT * FROM `reply` " +
            "WHERE bulletinid = #{bulletinid} AND replystate=0 " +
            "ORDER BY replydate DESC")
    public List<Reply> findBulletinReplies(int bulletinid);
}
