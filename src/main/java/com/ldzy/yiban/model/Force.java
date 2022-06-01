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
    private Integer forceid;
    private Integer memberid;
    private Integer forceindex;
    private String forceadddata;
    private Date forcedate;
    private Integer forcestate;

    public Force() {
    }

    @Override
    public String toString() {
        return "Force{" +
                "forceid=" + forceid +
                ", memberid=" + memberid +
                ", forceindex=" + forceindex +
                ", forceadddata='" + forceadddata + '\'' +
                ", forcedate=" + forcedate +
                ", forcestate=" + forcestate +
                '}';
    }

    public Integer getForceid() {
        return forceid;
    }

    public void setForceid(Integer forceid) {
        this.forceid = forceid;
    }

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public Integer getForceindex() {
        return forceindex;
    }

    public void setForceindex(Integer forceindex) {
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

    public Integer getForcestate() {
        return forcestate;
    }

    public void setForcestate(Integer forcestate) {
        this.forcestate = forcestate;
    }
}
