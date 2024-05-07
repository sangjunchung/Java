package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

/*
Date : 특정 날짜와 시간을 나타내는 클래스
Calendar : 날짜와 시간을 조작하는데 사용되는 추상클래스
GregorianCalendar : 그레고리력을 사용해서 날짜와 시간을 계산
SimpleDateFormat : 날짜와 시간을 형식으로 보여주고 그것을 출력
LocalDate : 현재 날짜 가져오기
*/

public class DateEx {

	public static void main(String[] args) {
		Date nowDate = new Date();
		System.out.println(nowDate);

		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("현재 날짜 :" + year + "/" + (month + 1) + "/" + day);

		/*
		 그리고리안 달력은 1년 1월 1일이 무조건 월요일로 정의돼있음 2024, 4, 23 을 하면 자동으로 2024, 5, 23 으로 변경됨
		 일요일부터 1 월 2 화 3 수 4 목 5 금 6 토 7 일 8 이렇게 진행됨
		 */
		GregorianCalendar gregorian = new GregorianCalendar(2024, 3, 23);
		int greDate = gregorian.get(Calendar.DAY_OF_WEEK);
		System.out.println("날짜 : " + greDate);

		/*
		 년 : y year 
		 월 : M Month (분이랑 첫글자가 m으로 겹쳐서 각각 대소문자로 나눔) 
		 일 : d day 
		 시 : H Hour (H : 0 ~ 23시, h : 오전(am)과 오후(pm)로 나눠서 표기) 
		 분 : m minute 초 : s second
		 요일 : E 국제 표준화 기구에서 E로 사용하기로 약속함
		 	  0요일까지 쓰고 싶으면 EEEE 로 표기하면됨
		 */
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String bringDate = dateFormat.format(new Date());
		System.out.println("날짜 형식 지정해서 표시하기 : " + bringDate);

		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜는 : " + currentDate);
	}
}
