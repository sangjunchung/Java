package com.kh.practice.leap.view;

import java.util.*;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	Scanner sc = new Scanner(System.in);
	LeapController lc = new LeapController();
	Calendar cal = Calendar.getInstance();
	
	public LeapView() {
		int year = cal.get(Calendar.YEAR);
		
		System.out.println(year+"년은 "+(lc.isLeapYear(year)? "윤년":"평년")+"입니다.");
		System.out.print("총 날짜 수 : "+lc.leapDate(cal));
	}
}
