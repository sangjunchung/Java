package sup2.controller;

import java.util.Scanner;

import sup2.model.Person;

public class TestSup2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("성별(남/여) : ");
		String gender = sc.nextLine();
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("키(소수점아래 첫째자리까지) : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(소수점아래 첫째자리까지 : ");
		double weight = sc.nextDouble();
		
		Person person = new Person(name, gender, phone, age, height, weight);
		person.information();
		
		sc.close();
	}
}
