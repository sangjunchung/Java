package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product product = new Product();
		
		product.setProduct("냉장고", 3_000_000, "삼성");
		
		product.information();
	}

}
