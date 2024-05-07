package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	private List<Book> list = new ArrayList<>();
	
	public BookController() {
		list.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		list.add(new Book("대화의 기술", "강보람", "인문", 17500));
		list.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	
	public void insertBook(Book b) {
		list.add(b);
	}
	
	public ArrayList<Book> selectList() {
		ArrayList<Book> selectList = (ArrayList<Book>) list;
		return selectList;
	}
	
	public ArrayList<Book> searchBook(String keyword){
		ArrayList<Book> searchList = new ArrayList<>();
		
		for(Book b : list) {
			if(b.getTitle().contains(keyword)) {
				searchList.add(b);
			}
		}
		
		return searchList;
	}
	
	public Book deleteBook(String inTitle, String inAuthor) { 
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(inTitle) && list.get(i).getAuthor().equals(inAuthor)) {		
				return list.remove(i);
			}
		}
		return null;
	}
	
	public int ascBook() { // :: = Book 파일의 getTitle을 참조해서 사용하겠다
		Collections.sort(list, Comparator.comparing(Book::getTitle));;
		return 1;
	}
}
