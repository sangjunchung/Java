package test.controller;

public class Test3 {

	public static void main(String[] args) {
		int num = 1;
		double sum = 0.0;
		double avg = 0.0;

		while (num <= 100) {
			sum += num;

			if (num == 100) {
				avg = sum / num;
			}
			num++;
		}
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f\n", avg);
	}
}
