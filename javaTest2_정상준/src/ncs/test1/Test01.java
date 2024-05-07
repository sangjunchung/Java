package ncs.test1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("점수 5개 입력(점수 사이는 공백으로) : ");
		String input = sc.nextLine();

		String[] total = input.split(" ");

		if (total.length != 5) {
			System.out.println("다시 입력하세요.");
			sc.close();
			return;
		}

		for (String a : total) {
			if (Integer.parseInt(a) < 10 || Integer.parseInt(a) > 99) {
				System.out.println("다시 입력하세요.");
				sc.close();
				return;
			}
		}

		double scoreA = (Integer.parseInt(total[0]) + Integer.parseInt(total[1])) / 2 * 0.6;
		double scoreB = (Integer.parseInt(total[2]) + Integer.parseInt(total[3])) / 2 * 0.2;
		double scoreC = Integer.parseInt(total[4]) * 0.2;
		double totalScore = scoreA + scoreB + scoreC;
		String classGrade;

		if (totalScore >= 90) {
			classGrade = "Gold Class";
		} else if (totalScore >= 80) {
			classGrade = "Silver Class";
		} else if (totalScore >= 70) {
			classGrade = "Bronze Class";
		} else {
			classGrade = "Normal Class";
		}

		System.out.println("평가 점수 : " + (int) totalScore + "점");
		System.out.println("Class : " + classGrade);

		sc.close();
	}

}
