package ncs.test2;

import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		System.out.print("공백 없이 문자열 입력 : ");
		String a = sc.nextLine();

		char[] chAr = a.toCharArray();

		for (int i = chAr.length - 1; i >= 0; i--) {
			if(chAr[i] >= 'a') {
				result += (char)(chAr[i]-32);
			} else {
				result += (char)chAr[i];
			}
		}
		System.out.println(result);
		sc.close();
	}
}
