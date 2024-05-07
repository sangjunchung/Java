package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member member1 = new Member();
		
		member1.printName();
		member1.changeName("김철수");
		member1.printName();
		System.out.println(member1.changeEmail("chulsu@google.com"));
		
	}

}
