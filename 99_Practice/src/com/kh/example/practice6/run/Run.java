package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "불변의 법칙 (절대 변하지 않는 것들에 대한 23가지 이야기)";
		book1.author = "모건 하우절";
		book1.publisher = "서삼독";
		book1.price = 22500;
		book1.discountRate = 0.05;

		Book book2 = new Book("일류의 조건", "사이토 다카시", "필름(Feelm)");
		book2.price = 17820;
		book2.discountRate = 0.02; 
				
		Book book3 = new Book("나를 소모하지 않는 현명한 태도에 관하여", "마티아스 뇔케", "퍼스트펭귄", 16020, 0.01);
		
		book1.inform();
		book2.inform();
		book3.inform();
	}
}
