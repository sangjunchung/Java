package com.kh.practice.book.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book implements Serializable{

	private String title;
	private String author;
	private int price;
	private Calendar date;
	private double discount;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public Calendar getDate() {
		return date;
	}

	public double getDiscount() {
		return discount;
	}

	public Book() {

	}

	public Book(String inTitle, String inAuthor, int inPrice, Calendar inData, double inDiscount) {
		this.title = inTitle;
		this.author = inAuthor;
		this.price = inPrice;
		this.date = inData;
		this.discount = inDiscount;
	}

	@Override
	public String toString() {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		return title + " " + author + " " + price + " " + sd.format(date.getTime()) + " " + discount;
	}
}
