package com.kh.oop.constructor;

public class Cafe {
	public String name;
	public String location;
	public int tableNum;
	
	public Cafe() {
		
	}
	
	public Cafe(String inName, String inLocation, int inTableNum) {
		this.name = inName;
		this.location = inLocation;
		this.tableNum = inTableNum;
	}
	
	public void cafeInfo() {
		System.out.println("카페 이름 : "+name);
		System.out.println("카페 지역 : "+location);
		System.out.println("테이블 수 : "+tableNum);
		System.out.println("---------------");
	}
	
	public static void main(String[] args) {
		System.out.println("안녕하세요. kh민족입니다.");
		System.out.println("=== 카페 조회하기 ===");
		
		Cafe cafe1 = new Cafe(); // 서울 강남구 도곡로 511
		cafe1.name = "스타벅스 대치점";
		cafe1.tableNum = 15;
		cafe1.cafeInfo();
		
		Cafe cafe2 = new Cafe(); // 예그리나카페
		cafe2.location = "제주 제주시 흥운길 93";
		cafe2.tableNum = 17;
		cafe2.cafeInfo();
		
		Cafe cafe3 = new Cafe("커피베이 강릉송정해변점", "강원 강릉시 창해로 85-42", 20);
		cafe3.cafeInfo();
	}
}
