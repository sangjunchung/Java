package com.kh.inheritance.ex;

public class CheckSmartphone {

	public static void main(String[] args) {
		iPhone p1 = new iPhone();

		p1.setScreen("레티나 디스플레이");
		System.out.println("p1.화면은 " + p1.getScreen());

		p1.setNewsAgency("KH");
		System.out.println("p1.통신사는 " + p1.getNewsAgency());

		p1.setCPU("최신");
		System.out.println("p1.성능은 " + p1.getCPU());
		// 부모클래스로 선언하고 자식 클래스로 생성한 경우는
		// ex. Smartphone p1 = new iPhone();
		// 부모의 기능은 가져올 수 있지만 자식의 기능은 가져올 수 없음
		// p1.setScreen 가능 / p1.setIOS 불가
		// 예외로 오버라이드한 기능은 자식클래스껄로 가져올수있음
		// p1.toString 시 자식클래스의 toString으로 실행됨
		// 자식클래스로 선언하고 자식 클래스로 생성한 경우
		// ex. iPhone p1 = new iPhone();
		// 부모 및 자식 클래스 기능을 모두 다 사용 가능
		p1.setIOS(10);
		System.out.println("p1.아이폰 버전은 " + p1.getIOS());

		System.out.println(p1.toString());
		System.out.println("==========================");
		
		Smartphone p2 = new GalaxyPhone();
		
		p2.setScreen("아몰레드");
		p2.setNewsAgency("KH");
		p2.setCPU("최신초고속");
		
		GalaxyPhone g1 = (GalaxyPhone) p2;
		g1.setAOS(11);
		
		System.out.println(p2.toString());
		System.out.println(g1.toString());
	}
}
