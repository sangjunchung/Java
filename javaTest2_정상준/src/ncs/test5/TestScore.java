package ncs.test5;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] dbAr = new double[3][5];

		for (int i = 0; i < dbAr.length; i++) {
			double total = 0.0;

			for (int j = 0; j < 3; j++) {
				System.out.print((i + 1) + "번 학생의 " + (j + 1) + "번 과목 점수 입력 : ");
				dbAr[i][j] = sc.nextDouble();
				total += dbAr[i][j];
			}
			dbAr[i][3] = total;
			dbAr[i][4] = total / 3.0;
		}
		System.out.println();
		System.out.println("index\t과목1\t과목2\t과목3\t총점\t평균");
		for (int i = 0; i < dbAr.length; i++) {
			System.out.printf("%d\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n", i, dbAr[i][0], dbAr[i][1], dbAr[i][2], dbAr[i][3],
					dbAr[i][4]);
		}
		
		sc.close();
	}

}
