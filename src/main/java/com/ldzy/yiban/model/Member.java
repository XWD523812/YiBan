package com.ldzy.yiban.model;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Component
public class Member implements Serializable {

	private static final long serialVersionUID = 1L;

	@Min(value = 0,message = "编号为自然数，最小为0")
	private Integer memberid; // 成员编号（主键）

	@Pattern(regexp = "[\u4E00-\u9FA5]",message = "用户名仅限使用中文")
	@Size(min = 1 ,max = 7 ,message = "用户名必须为1-7位中文字符")
	private String membername; // 姓名

	// @NotBlank(message = "密码不能为空") 限制长度之后，已经不需要判断是否为空
	@Size(min = 6 ,max = 18 ,message = "密码必须为6-18位")
	private String password; // 密码

	private String bumen; // 部门

	private Integer force; // 总战力

	private String picture;// 头像

	private String introduce; //个人简介

	@Min(value = 0,message = "状态最小为0，表示最高权限")
	@Max(value = 1,message = "状态最大为2，表示普通权限")
	private Integer qx; // 权限

	private List<Force> forces;

	private List<Bulletin> bulletins;


	public Member() {
	}


	@Override
	public String toString() {
		return "Member{" +
				"memberid=" + memberid +
				", membername='" + membername + '\'' +
				", password='" + password + '\'' +
				", bumen='" + bumen + '\'' +
				", force=" + force +
				", picture='" + picture + '\'' +
				", introduce='" + introduce + '\'' +
				", qx=" + qx +
				", forces=" + forces +
				", bulletins=" + bulletins +
				'}';
	}


	public Integer getMemberid() {
		return memberid;
	}

	public void setMemberid(Integer memberid) {
		this.memberid = memberid;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBumen() {
		return bumen;
	}

	public void setBumen(String bumen) {
		this.bumen = bumen;
	}

	public Integer getForce() {
		return force;
	}

	public void setForce(Integer force) {
		this.force = force;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public Integer getQx() {
		return qx;
	}

	public void setQx(Integer qx) {
		this.qx = qx;
	}

	public List<Force> getForces() {
		return forces;
	}

	public void setForces(List<Force> forces) {
		this.forces = forces;
	}

	public List<Bulletin> getBulletins() {
		return bulletins;
	}

	public void setBulletins(List<Bulletin> bulletins) {
		this.bulletins = bulletins;
	}
}
