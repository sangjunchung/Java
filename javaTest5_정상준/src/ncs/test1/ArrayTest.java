package ncs.test1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest {

	public static void print(int[] arr) {
		System.out.print("array : ");
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public static int max(int[] arr) {
		return arr[arr.length - 1];
	}

	public static int min(int[] arr) {
		return arr[0];
	}

	public static int evenCount(int[] arr) {
		int count = 0;

		for (int n : arr) {
			if (n % 2 == 0) {
				count++;
			}
		}

		return count;
	}

	public static int oddCount(int[] arr) {
		int count = 0;

		for (int n : arr) {
			if (n % 2 == 1) {
				count++;
			}
		}

		return count;
	}

	public static int sum(int[] arr) {
		int total = 0;
		
		for (int n : arr) {
			total += n;
		}
		
		return total;
	}

	public static double avg(int[] arr) {
		double average = 0.0;
		
		average = (double)sum(arr) / arr.length;

		return average;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("할당된 배열의 크기(1~10) : ");
		int num = sc.nextInt();
		if (num < 1 || num > 10) {
			System.out.println("입력된 숫자가 범위를 벗어났습니다.");
			sc.close();
			return;
		}

		int[] array = new int[num];

		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(100) + 1;
		}

		print(array);

		Arrays.sort(array);

		System.out.println("가장 큰 값 : " + max(array));
		System.out.println("가장 작은 값 : " + min(array));
		System.out.println("짝수의 개수 : " + evenCount(array));
		System.out.println("홀수의 개수 : " + oddCount(array));
		System.out.println("합계 : " + sum(array));
		System.out.printf("평균 : %.2f", avg(array));

		sc.close();
	}
}
