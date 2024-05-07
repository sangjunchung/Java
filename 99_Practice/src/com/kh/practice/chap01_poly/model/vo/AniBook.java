package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book {
	private int accessAge;

	public AniBook() {

	}

	public int getAccessAge() {
		return accessAge;
	}

	public AniBook(String inTitle, String inAuthor, String inPublisher, int inAccessAge) {
		super(inTitle, inAuthor, inPublisher);
		this.accessAge = inAccessAge;
	}

	public String toString() {
		return super.toString() + ", 제한 나이 : " + accessAge;
	}
}
