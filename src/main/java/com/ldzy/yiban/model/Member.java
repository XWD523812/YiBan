package com.ldzy.yiban.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Member implements Serializable {

	private static final long serialVersionUID = 1L;
	private int memberid; // 成员编号（主键）
	private String membername; // 姓名
	private String password; // 密码
	private String bumen; // 部门
	private Double force; // 总战力
	private int qx; // 权限

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
				", qx=" + qx +
				'}';
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
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

	public Double getforce() {
		return force;
	}

	public void setforce(Double jifen) {
		this.force = jifen;
	}

	public int getQx() {
		return qx;
	}

	public void setQx(int qx) {
		this.qx = qx;
	}
}