package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {

	public static void main(String[] args) {
		SimpleDateFormat simple1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		
		String sim1 = simple1.format(date);

		System.out.println("년월일 : " + sim1);

		SimpleDateFormat simple2 = new SimpleDateFormat("HH:mm:ss");
		String sim2 = simple2.format(date);

		System.out.println("시분초 : " + sim2);

		SimpleDateFormat simple3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sim3 = simple3.format(date);

		System.out.println("년월일 시분초 : " + sim3);

		SimpleDateFormat simple4 = new SimpleDateFormat("EEEE");
		String sim4 = simple4.format(date);

		System.out.println("오늘의 요일 : " + sim4);
	}

}
