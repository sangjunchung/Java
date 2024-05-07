package com.kh.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int[] array = new int[10];
		
		for(int i=0; i<array.length; i++) {
			array[i] = i+1;
		}
		
		for(int i : array) {
			System.out.print(i+ " ");
		}
	}
	
	public void practice2() {
		int[] array = new int[10];
		
		for(int i=0; i<array.length; i++) {
			array[i] = array.length - i;
		}
		
		for(int i : array) {
			System.out.print(i+ " ");
		}
	}
	
	public void practice3() {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		num = sc.nextInt();
		
		int[] array = new int[num];
		
		for(int i=0; i<array.length; i++) {
			array[i] = i+1;
		}
		
		for(int i : array) {
			System.out.print(i+ " ");
		}
	}
	
	public void practice4() {
		String[] array = new String[5];
		array[0] = "사과";
		array[1] = "귤";
		array[2] = "포도";
		array[3] = "복숭아";
		array[4] = "참외";
		
		System.out.println(array[1]);
	}
	
	public void practice5() {
		String str = "";
		String index = "";
		char find;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		str = sc.nextLine();
		System.out.print("문자 : ");
		find = sc.next().charAt(0);
		
		char[] array = str.toCharArray();
		
		for(int i=0; i<array.length; i++) {
			if(find == array[i]) {
				index += " "+i;
				count++;
			}
		}
		if(index == "") {
			index = "미존재";
		}
		System.out.println(str+"에 "+find+"가 존재하는 위치(인덱스) : "+index);
		System.out.println(find+" 개수 : "+count);
	}
	
	public void practice6() {
		int num = 0;
		String[] array = {"월", "화", "수", "목", "금", "토", "일"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		num = sc.nextInt();
		if(num >=0 && num <7) System.out.println(array[num]);
		else System.out.println("잘못 입력하셨습니다.");
	}
	
	public void practice7() {
		int num = 0;
		int total = 0;
		int putNum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		num = sc.nextInt();
		int[] array = new int[num];
		
		for(int i=0; i<array.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			putNum = sc.nextInt();
			array[i] = putNum;
			total += array[i];
		}
		for(int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("총 합 : "+total);
	}
	
	public void practice8() {
		int num = 0;
		int put = 0;
		boolean check = true;
		int[] array = {};
		
		Scanner sc = new Scanner(System.in);
		
		while(check) {
			System.out.print("정수 : ");
			num = sc.nextInt();
			
			if(num>=3 && (num%2)==1) {
				array = new int[(2*num)-1];
				for(int i=0; i<array.length; i++) {
					if(i<=(array.length/2)) {
						put++;
						array[i] = put;
					} else {
						put--;
						array[i] = put;
					}
				}
				check = false;
				for(int i : array) System.out.print(i+" ");
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	public void practice9() {
		int[] array = new int[7];
		
		for(int i=0; i<array.length; i++) {
			array[i] = (int)((Math.random()*45)+1);
		}
		for(int i : array) System.out.print(i+" ");
	}
	
	public void practice10() {
		String str = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		str = sc.nextLine();
		
		char[] star = new char[str.length()];
		
		for(int i=0; i<star.length; i++) {
			if(i<8) star[i] = str.charAt(i);
			else star[i] = '*';
		}
		for(char ch : star) System.out.print(ch);
	}
	
	public void practice11() {
		int[] array = new int[10];
		
		for(int i=0; i<array.length; i++) {
			array[i] = (int)((Math.random()*10)+1);
		}
		for(int i : array) System.out.print(i+" ");
	}
	
	public void practice12() {
		int[] array = new int[10];
		
		for(int i=0; i<array.length; i++) {
			array[i] = (int)((Math.random()*10)+1);
		}
		for(int i : array) System.out.print(i+" ");
		
		Arrays.sort(array);
		
		System.out.println();
		System.out.println("최대값 : "+array[array.length-1]);
		System.out.println("최소값 : "+array[0]);
	}
	
	public void practice13() {
		int[] lotto = new int[10];
		boolean check = true;
		boolean check2;
		int count = 0;
		
		while(check) {
			check2 = true;
			lotto[count] = (int)(Math.random()*10)+1;
			if(count==0) {
				count++;
				continue;
			}		
			for(int i=0; i<count; i++) {
				if(lotto[i] == lotto[count]) {
					check2 = false;
					break;
				} 	
			}
			if(count<=9 && check2) {
				count++;
			}
			if(count==10) {
				check = false;
			}
		}
		for(int i: lotto) System.out.print(i+" ");
	}
	
	public void practice14() {
		int[] lotto = new int[6];
		boolean check = true;
		boolean check2;
		int count = 0;
		
		while(check) {
			check2 = true;
			lotto[count] = (int)(Math.random()*45)+1;
			if(count==0) {
				count++;
				continue;
			}		
			for(int i=0; i<count; i++) {
				if(lotto[i] == lotto[count]) {
					check2 = false;
					break;
				} 	
			}
			if(count<=5 && check2) {
				count++;
			}
			if(count==6) {
				check = false;
			}
		}
		Arrays.sort(lotto);
		for(int i: lotto) System.out.print(i+" ");
	}
	
	public void practice15() {
		String str = "";
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		str = sc.nextLine();
		
		char[] ch = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			if(i==0) {
				ch[i] = str.charAt(i);
				count++;
			}
			for(int j=0; j<count; j++) {
				if(ch[j] == str.charAt(i)) {
					break;
				} else if(count == j+1) {
					ch[count] = str.charAt(i);
					count++;
					break;
				}
			}
		}
		System.out.print("문자열에 있는 문자 : ");
		for(int i=0; i<count; i++) {
			if(i == count-1) System.out.println(ch[i]);
			else System.out.print(ch[i]+", ");
		}
		System.out.println("문자 개수 : "+count);
	
	}
	
	public void practice16() {
		String[] strarray = {};
		int num = 0;
		int count = 0;
		boolean check = true;
		String yesNo = "";
		String str = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		num = sc.nextInt();
		sc.nextLine();
		
		strarray = new String[num];
		
		for(int i=0; i<strarray.length; i++) {
			System.out.print((count+1)+"번째 문자열 : ");
			strarray[i] = sc.nextLine();
			count++;
		}
		
		while(check) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			yesNo = sc.next();
			
			if(yesNo.equalsIgnoreCase("N") || yesNo.equalsIgnoreCase("NO")) {
				for(int i=0; i<strarray.length; i++) {
					if(i==0) System.out.print("["+strarray[i]+", ");
					else if(i==(strarray.length-1)) System.out.println(strarray[i]+"]");
					else System.out.print(strarray[i]+", ");
				}
				check = false;
			} else if(yesNo.equalsIgnoreCase("Y") || yesNo.equalsIgnoreCase("YES")){
				System.out.print("더 입력하고 싶은 개수 : ");
				num = sc.nextInt();
				sc.nextLine();
				
				List<String> strlist = new ArrayList<String>(Arrays.asList(strarray));
				
				for(int i=0; i<num; i++) {
					System.out.print((count+1)+"번째 문자열 : ");
					str = sc.nextLine();
					strlist.add(str);
					count++;
				}
				strarray = strlist.toArray(new String[strlist.size()]);
			} else {
				System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
				check = false;
			}
		}
	}
	
	public void practice17() {
		String[] str = {"양념", "후라이드", "간장"};
		String flavor = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 치킨 맛을 입력하세요 : ");
		flavor = sc.next();
		
		for(String st : str) {
			if(flavor.equals(st)){
				System.out.println(flavor+"치킨 배달 가능");
				return;
			}
		}
		System.out.println(flavor+"치킨은 없는 메뉴입니다.");
	}
}
