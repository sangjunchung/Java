package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("날짜를 입력해주세요.");
		System.out.print("년 : ");
		int year = sc.nextInt();
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("일 : ");
		int day = sc.nextInt();

		boolean checkLeap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				checkLeap = false;
			} else {
				checkLeap = true;
			}
		}

		Calendar inputdate = new GregorianCalendar(year, month-1, day);
		Date date = inputdate.getTime();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 M월 dd일 EEEE");
		String formatDate = sd.format(date);
		
		System.out.println("입력된 날짜에 대한 정보는 아래와 같습니다.");
		System.out.println(formatDate);
		System.out.println(year + "년은 " + (checkLeap ? "윤년" : "평년") + "이다.");

		sc.close();
	}
}
