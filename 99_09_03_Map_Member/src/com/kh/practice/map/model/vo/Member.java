package com.kh.practice.map.model.vo;

public class Member {
	private String name;
	private String password;

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public Member() {

	}

	public Member(String inPassword, String inName) {
		this.password = inPassword;
		this.name = inName;
	}

	@Override
	public String toString() {
		return name + " - " + password;

	}
}
