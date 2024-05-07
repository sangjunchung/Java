package com.kh.arrayList.pre;

import java.util.Arrays;

public class BookArrays {
	
	public static void main(String[] args) {
		Book[] book = new Book[3];
		book[0] = new Book("아몬드", "손원평");
		book[1] = new Book("불변의 법칙", "모건 하우철");
		book[2] = new Book("나는 읽고 쓰고 버린다", "손웅정");
		
		Book[] rainbow = Arrays.copyOf(book, book.length);
		
		System.out.println(book);
		System.out.println(rainbow);
		
		for(Book b : rainbow) {
			b.showbook();
		}
		
		System.out.println(book==rainbow);
		System.out.println(book[0]==rainbow[0]);
		System.out.println(book[1]==rainbow[1]);
		System.out.println(book[2]==rainbow[2]);
		
		Book[] redbook = Arrays.copyOf(rainbow, 1);
		
		for(Book b : redbook) {
			b.showbook();
		}
		
		
	}
}
