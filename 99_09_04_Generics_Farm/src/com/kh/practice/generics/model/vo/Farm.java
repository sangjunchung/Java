package com.kh.practice.generics.model.vo;

import java.util.Objects;

public class Farm {
	private String kind;

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public Farm() {

	}

	public Farm(String inKind) {
		this.kind = inKind;
	}

	@Override
	public String toString() {
		return kind;
	}

	@Override
	public int hashCode() {
		return Objects.hash(kind);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Farm other = (Farm) obj;
		return Objects.equals(kind, other.kind);
	}
}
