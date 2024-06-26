package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		int year = 1987;
		int month = 5;
		int day = 27;

		Calendar now = Calendar.getInstance();
		int nowYear = now.get(Calendar.YEAR);
		int nowMonth = now.get(Calendar.MONTH);
		int nowDay = now.get(Calendar.DAY_OF_MONTH);

		Calendar birth = new GregorianCalendar(year, month-1, day);
		
		int age = nowYear - year;
		if (nowMonth < month || (nowMonth == month && nowDay < day)) {
			age--;
		}
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 M월 dd일 EEEE");
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy년 M월 dd일");

		System.out.println("생일 : "+sf.format(birth.getTime()));
		System.out.println("현재 : "+sf1.format(now.getTime()));
		System.out.println("나이 : "+age+" 세");
	}

}
