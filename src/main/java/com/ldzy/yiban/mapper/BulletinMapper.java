package com.ldzy.yiban.mapper;

import com.ldzy.yiban.model.Bulletin;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auction:XWD
 * @Data:2022/6/1
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */
@Mapper
@Repository
public interface BulletinMapper {

    @Select("SELECT * FROM `bulletin` WHERE bulletinid = #{bulletinid}")
    public Bulletin findBulletin(Bulletin bulletin);

    @Update("<script>" +
            "UPDATE `bulletin` " +
            "<set>" +
            "<if test = 'bulletinstate != null'> bulletinstate = #{bulletinstate}, </if>" +
            "<if test = 'attendance != null'> attendance = #{attendance} + 1 ,</if> " +
            "</set>" +
            " WHERE bulletinid = #{bulletinid}" +
            "</script>")
    public void updateBulletin(Bulletin bulletin);

    @Insert("INSERT INTO `bulletin`(memberid,bulletinclass,bulletintitle,bulletinbody)" +
            "VALUES(#{memberid},#{bulletinclass},#{bulletintitle},#{bulletinbody})")
    public void insertBulletin(Bulletin bulletin);

    @Delete("DELETE FROM `bulletin` WHERE bulletinid=#{bulletinid}")
    public void deleteBulletin(Bulletin bulletin);

    /**
     *  一对多查询，将List对象集合传给Member对象
     * @return
     */
    @Select("SELECT * FROM `Bulletin` WHERE memberid = #{memberid} ORDER BY bulletindate DESC")
    public List<Bulletin> findMemberBulletins(int memberid);

    /**
     * 一对多查询，将List对象集合接受到List<Picture> pictures属性里面
     *  加载告示里面及的所有图片
     * @return
     */
    @Select("SELECT bulletinid,memberid,bulletinclass,bulletintitle,bulletinbody,bulletindate,attendance" +
            " FROM bulletin WHERE bulletinid = #{bulletinid}")
    @Results(id = "PicturesMap" , value = {
            @Result(column = "bulletinid",property = "bulletinid"),
            @Result(column = "bulletinid",property = "pictures",
                    many = @Many(select = "com.ldzy.yiban.mapper.PictureMapper.findBulletinPictures")
            )
    })
    public Bulletin findBulletinPictures(Bulletin bulletin);

    /**
     *  查询所有日志并分页显示
     * @return
     */
    @Select("<script>" +
            "SELECT * FROM `Bulletin` " +
            "<where>" +
            "<if test='memberid != null'> memberid = #{memberid} </if>" +
            "</where>" +
            "</script>")
    public List<Bulletin> findBulletins(Bulletin bulletin);

}
