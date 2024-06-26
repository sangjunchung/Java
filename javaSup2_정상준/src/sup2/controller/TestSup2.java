package sup2.controller;

import java.util.Scanner;

import sup2.model.Student;

public class TestSup2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 이름 : ");
		String stdName = sc.nextLine();
		System.out.print("학년 : ");
		int stdGrade = sc.nextInt();
		System.out.print("반 : ");
		int stdClass = sc.nextInt();
		System.out.print("번호 : ");
		int stdNumber = sc.nextInt();
		System.out.print("성별 (M/F) : ");
		char stdGender = sc.next().charAt(0);
		System.out.print("성적 : ");
		double stdScore = sc.nextDouble();
		
		Student std = new Student(stdName, stdGrade, stdClass, stdNumber, stdGender, stdScore);
		std.information();
		
		sc.close();
	}
}
