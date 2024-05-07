package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {

	public boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}
	
	public long leapDate(Calendar cal) {
		int cuYear = cal.get(Calendar.YEAR);
		long totalDay = 0;
		
		for(int i=1; i<=cuYear; i++) {
			if(isLeapYear(cuYear)) {
				totalDay += 366;
			} else {
				totalDay += 365;
			}
		}
		return totalDay;
	}
}
