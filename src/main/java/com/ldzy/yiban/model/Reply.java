package com.ldzy.yiban.model;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * @Auction:XWD
 * @Data:2022/6/14
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */

@Component
public class Reply {

    @Min(value = 0,message = "编号为自然数，最小为0")
    private Integer replyid; // 回复编号

    @Min(value = 0,message = "编号为自然数，最小为0")
    private Integer bulletinid; // 告示编号

    @Min(value = 0,message = "编号为自然数，最小为0")
    private Integer memberid; // 成员编号

    @Min(value = 0,message = "状态最小为0，表示正常")
    @Max(value = 1,message = "状态最大为1，表示隐藏")
    private Integer replystate; // 状态

    @Size(min = 0 ,max = 100 ,message = "内容必须为0-100个字符")
    private String replybody; // 回复内容

    private Date replydate; // 回复时间

    public Reply() {
    }

    @Override
    public String toString() {
        return "Reply{" +
                "replyid=" + replyid +
                ", bulletinid=" + bulletinid +
                ", memberid=" + memberid +
                ", replystate=" + replystate +
                ", replybody='" + replybody + '\'' +
                ", replydate=" + replydate +
                '}';
    }

    public Integer getReplyid() {
        return replyid;
    }

    public void setReplyid(Integer replyid) {
        this.replyid = replyid;
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

    public Integer getReplystate() {
        return replystate;
    }

    public void setReplystate(Integer replystate) {
        this.replystate = replystate;
    }

    public String getReplybody() {
        return replybody;
    }

    public void setReplybody(String replybody) {
        this.replybody = replybody;
    }

    public Date getReplydate() {
        return replydate;
    }

    public void setReplydate(Date replydate) {
        this.replydate = replydate;
    }
}
