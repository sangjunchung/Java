package com.kh.practice.generics.model.vo;

import java.util.Objects;

public class Vegetable extends Farm {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Vegetable() {

	}

	public Vegetable(String inKind, String inName) {
		super(inKind);
		this.name = inName;
	}

	@Override
	public String toString() {
		return super.toString() + ": " + name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(name);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vegetable other = (Vegetable) obj;
		return Objects.equals(name, other.name);
	}

}
