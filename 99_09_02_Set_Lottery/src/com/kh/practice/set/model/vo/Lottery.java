package com.kh.practice.set.model.vo;

import java.util.Objects;

public class Lottery implements Comparable<Lottery>{
	private String name;
	private String phone;

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public Lottery() {

	}

	public Lottery(String inName, String inPhone) {
		this.name = inName;
		this.phone = inPhone;
	}

	@Override
	public String toString() {
		return name + "(" + phone + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Lottery other = (Lottery) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

	@Override
	public int compareTo(Lottery o) {
		return this.name.compareTo(o.name);
	}
}
