package sup1.controller;

import java.util.Scanner;

import sup1.model.Score;

public class TestSup1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int korScore = sc.nextInt();
		System.out.print("영어 점수 : ");
		int engScore = sc.nextInt();
		System.out.print("수학 점수 : ");
		int mathScore = sc.nextInt();
		
		Score score = new Score(korScore, engScore, mathScore);
		score.result();
		
		sc.close();
	}
}
