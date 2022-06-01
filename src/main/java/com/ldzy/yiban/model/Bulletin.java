package com.ldzy.yiban.model;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @Auction:XWD
 * @Data:2022/6/1
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */

@Component
public class Bulletin {
    private Integer bulletinid;
    private Integer memberid;
    private String bulletintitle;
    private String bulletinbody;
    private String bulletinclass;
    private Date bulletindate;
    private Integer bulletinstate;
    private Integer attendance;

    private List<Picture> pictures;

    public Bulletin() {
    }

    @Override
    public String toString() {
        return "Bulletin{" +
                "bulletinid=" + bulletinid +
                ", memberid=" + memberid +
                ", bulletintitle='" + bulletintitle + '\'' +
                ", bulletinbody='" + bulletinbody + '\'' +
                ", bulletinclass='" + bulletinclass + '\'' +
                ", bulletindate=" + bulletindate +
                ", bulletinstate=" + bulletinstate +
                ", attendance=" + attendance +
                ", pictures=" + pictures +
                '}';
    }

    public Integer getBulletinid() {
        return bulletinid;
    }

    public void setBulletinid(Integer bulletinid) {
        this.bulletinid = bulletinid;
    }

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public String getBulletintitle() {
        return bulletintitle;
    }

    public void setBulletintitle(String bulletintitle) {
        this.bulletintitle = bulletintitle;
    }

    public String getBulletinbody() {
        return bulletinbody;
    }

    public void setBulletinbody(String bulletinbody) {
        this.bulletinbody = bulletinbody;
    }

    public String getBulletinclass() {
        return bulletinclass;
    }

    public void setBulletinclass(String bulletinclass) {
        this.bulletinclass = bulletinclass;
    }

    public Date getBulletindate() {
        return bulletindate;
    }

    public void setBulletindate(Date bulletindate) {
        this.bulletindate = bulletindate;
    }

    public Integer getBulletinstate() {
        return bulletinstate;
    }

    public void setBulletinstate(Integer bulletinstate) {
        this.bulletinstate = bulletinstate;
    }

    public Integer getAttendance() {
        return attendance;
    }

    public void setAttendance(Integer attendance) {
        this.attendance = attendance;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }
}
