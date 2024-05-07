package com.kh.practice.list.library.model.vo;

public class Book {
	private String title;
	private String author;
	private String category;
	private int price;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getCategory() {
		return category;
	}

	public int getPrice() {
		return price;
	}

	public Book() {

	}

	public Book(String inTitle, String inAuthor, String inCategory, int inPrice) {
		this.title = inTitle;
		this.author = inAuthor;
		this.category = inCategory;
		this.price = inPrice;
	}

	@Override
	public String toString() {
		return "(제목 : "+title+" / 저자 : "+author+" / 장르 : "+category+" / 가격 : "+price+")";
	}

	@Override
	public int hashCode() {
		return 0;
	}

	public boolean equals() {
		return true;
	}

	public int compareTo() {
		return 0;
	}
}
