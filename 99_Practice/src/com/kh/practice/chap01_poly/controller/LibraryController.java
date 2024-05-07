package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.*;
import java.util.*;

public class LibraryController {
	private Member mem = null;
	private Book[] bList = new Book[5];

	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}

	public void insertMember(String inName, int inAge, char inGender) {
		mem = new Member(inName, inAge, inGender);
	}

	public Member myInfo() {
		return mem;
	}

	public Book[] selectAll() {
		return bList;
	}

	public Book[] searchBook(String keyword) {
		List<Book> nbList = new ArrayList<>();
		Book[] sBook;

		for (Book b : bList) {
			if (b.getTitle().contains(keyword)) {
				nbList.add(b);
			}
		}
		if (nbList.size() == 0) {
			sBook = null;
		} else {
			sBook = nbList.toArray(new Book[nbList.size()]);
		}

		return sBook;
	}

	public int rentBook(int inRent) {
		int result = 0;

		if (bList[inRent] instanceof AniBook) {
			AniBook ani = (AniBook) bList[inRent];

			if (mem.getAge() < ani.getAccessAge()) {
				result = 1;
			}
		} else {
			CookBook cb = (CookBook) bList[inRent];

			if (cb.isCoupon()) {
				mem.setCouponCount(1);
				result = 2;
			}
		}

		return result;
	}
}
