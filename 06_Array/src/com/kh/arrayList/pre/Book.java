package com.kh.arrayList.pre;

public class Book {
	private String bookName;
	private String author;

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}
	
	public Book() {
		
	}
	
	public Book(String inBookName, String inAuthor) {
		this.bookName = inBookName;
		this.author = inAuthor;
	}
	
	public void showbook() {
		System.out.println("책 이름 : "+bookName+", 저자 : "+author);
	}
}
