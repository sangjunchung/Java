package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book {
	private boolean coupon;

	public CookBook() {

	}

	public boolean isCoupon() {
		return coupon;
	}

	public CookBook(String inTitle, String inAuthor, String inPublisher, boolean inCoupon) {
		super(inTitle, inAuthor, inPublisher);
		this.coupon = inCoupon;
	}

	public String toString() {
		return super.toString() + ", 요리학원쿠폰유무 : " + (coupon ? "있음" : "없음");
	}
}
