package com.ldzy.yiban.model;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Auction:XWD
 * @Data:2022/5/26
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */

@Component
public class Force {
    private int forceid;
    private int memberid;
    private Double forceindex;
    private String forceadddata;
    private Date forcedate;

    public Force() {
    }

    @Override
    public String toString() {
        return "Force{" +
                "forceid=" + forceid +
                ", memberid='" + memberid + '\'' +
                ", forceindex=" + forceindex +
                ", forceadddata='" + forceadddata + '\'' +
                ", forcedate=" + forcedate +
                '}';
    }

    public int getForceid() {
        return forceid;
    }

    public void setForceid(int forceid) {
        this.forceid = forceid;
    }

    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    public Double getForceindex() {
        return forceindex;
    }

    public void setForceindex(Double forceindex) {
        this.forceindex = forceindex;
    }

    public String getForceadddata() {
        return forceadddata;
    }

    public void setForceadddata(String forceadddata) {
        this.forceadddata = forceadddata;
    }

    public Date getForcedate() {
        return forcedate;
    }

    public void setForcedate(Date forcedate) {
        this.forcedate = forcedate;
    }

}
