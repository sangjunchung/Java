package com.kh.example.practice6.model.vo;

public class Book {
	public String title;
	public String author;
	public String publisher;
	public int price;
	public double discountRate;
	
	public Book() {
		
	}
	
	public Book(String inTitle, String inAuthor, String inPublisher) {
		this.title = inTitle;
		this.author = inAuthor;
		this.publisher = inPublisher;
	}
	
	public Book(String inTitle, String inAuthor, String inPublisher, int inPrice, double inDiscountRate) {
		this.title = inTitle;
		this.author = inAuthor;
		this.publisher = inPublisher;
		this.price = inPrice;
		this.discountRate = inDiscountRate;
	}
	
	public void inform() {
		System.out.println("책 이름 : "+title);
		System.out.println("책 저자 : "+author);
		System.out.println("책 출판 : "+publisher);
		System.out.println("책 가격 : "+price);
		System.out.println("책 할인율 : "+(int)(discountRate*100)+"%");
		System.out.println("---------------");
	}
}
