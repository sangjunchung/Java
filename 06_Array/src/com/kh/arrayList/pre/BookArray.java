package com.kh.arrayList.pre;

public class BookArray {

	public static void main(String[] args) {
		Book[] book = new Book[3];
		book[0] = new Book("아몬드", "손원평");
		book[1] = new Book("불변의 법칙", "모건 하우철");
		book[2] = new Book("나는 읽고 쓰고 버린다", "손웅정");
	
		System.out.println(book);
		
		for(Book b : book) {
			b.showbook();
		}
	
	}
}
