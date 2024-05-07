package com.kh.oop.constructor;

public class Join {
	public int memberNo;
	public String memberId;
	public String memberName;
	public String phoneNumber;
	
	public Join() {
		
	}
	
	public Join(int inMemberNo, String inMemberID, String inMemberName, String inPhoneNumber) {
		this.memberNo = inMemberNo;
		this.memberId = inMemberID;
		this.memberName = inMemberName;
		this.phoneNumber = inPhoneNumber;
	}
	
	public void memberInfo() {
		System.out.println("회원 번호 : "+memberNo);
		System.out.println("회원 ID : "+memberId);
		System.out.println("회원 이름 : "+memberName);
		System.out.println("회원 전화 : "+phoneNumber);
		System.out.println("=======================");
	}

	public static void main(String[] args) {
		
		System.out.println("=== kh 쇼핑 회원 정보 확인 ===");
		
		Join member1 = new Join();
		member1.memberId = "직장인";
		member1.memberName = "동그라미";
		member1.phoneNumber = "010-1111-2222";
		member1.memberInfo();
		
		Join member2 = new Join();
		member2.memberId = "학생휴먼";
		member2.memberName = "홍길동";
		member2.phoneNumber = "010-2222-3333";
		member2.memberInfo();
		
		Join member3 = new Join(3, "파워보이", "박영희", "010-3333-4444");
		member3.memberInfo();
		
		Join member4 = new Join();
		member4.memberNo = 4;
		member4.memberName = "김철수";
		member4.memberInfo();
		
		Join member5 = new Join(5, "슈퍼맨", "딘 케인", "010-1938-1932");
		member5.memberInfo();
		
	}
	
}
