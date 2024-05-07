package com.kh.practice.chap01_poly.model.vo;

public class Book {
	private String title;
	private String author;
	private String publisher;

	public Book() {

	}

	public String getTitle() {
		return title;
	}

	public Book(String inTitle, String inAuthor, String inPublisher) {
		this.title = inTitle;
		this.author = inAuthor;
		this.publisher = inPublisher;
	}

	@Override
	public String toString() {
		return "도서명 : " + title + ", 저자명 : " + author + ", 출판사명 : " + publisher;
	}
}
