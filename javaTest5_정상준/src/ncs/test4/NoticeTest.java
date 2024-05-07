package ncs.test4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class NoticeTest {

	public static void fileSave(Object[] array) {
		File file = new File("notice.dat");

		if (file.exists()) {
			return;
		} else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(array);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Notice> fileRead() {
		File file = new File("notice.dat");
		List<Object> list = new ArrayList<>();

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			Object[] obAr = (Object[]) ois.readObject();
			list = Arrays.asList(obAr);
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ArrayList<Notice> alist = new ArrayList<>();
		for(Object o : list) {
			alist.add((Notice)o);
		}
		
		return alist;
	}

	public static void main(String[] args) {
		Object[] obArray = new Object[3];
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());

		System.out.println("등록할 공지사항을 입력하시오.(3번 반복 입력함)");
		for (int i = 0; i < obArray.length; i++) {
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("작성자 : ");
			String writer = sc.nextLine();
			System.out.print("내용 : ");
			String content = sc.nextLine();

			obArray[i] = new Notice((i + 1), title, cal, writer, content);
			
			System.out.println();
		}

		try {
			Notice no0 = (Notice) obArray[0];
			no0.setDate(new SimpleDateFormat("yyyy-MM-dd").parse("2016-03-15"));

			Notice no1 = (Notice) obArray[1];
			no1.setDate(new SimpleDateFormat("yyyy-MM-dd").parse("2016-04-23"));

			Notice no2 = (Notice) obArray[2];
			no2.setDate(new SimpleDateFormat("yyyy-MM-dd").parse("2016-05-12"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		fileSave(obArray);

		ArrayList<Notice> list = fileRead();

		for (Notice ti : list) {
			System.out.println(ti.toString());
		}

		sc.close();
	}
}
