package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

	public DimensionPractice() {

	}

	public void practice1() {
		String[][] array = new String[3][3];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = "(" + i + ", " + j + ")";
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	public void practice2() {
		int[][] num = new int[4][4];

		for (int i = 0; i < num.length * num[0].length; i++) {
			num[i / num.length][i % num.length] = i + 1;
		}

		for (int i = 0; i < num.length * num[0].length; i++) {
			if (i < 9)
				System.out.print(" " + num[i / num.length][i % num.length] + " ");
			else
				System.out.print(num[i / num.length][i % num.length] + " ");

			if ((i + 1) % 4 == 0)
				System.out.println();
		}
	}

	public void practice3() {
		int[][] num = new int[4][4];

		for (int i = 0; i < num.length * num[0].length; i++) {
			num[i / num.length][i % num.length] = num.length * num[0].length - i;
		}

		for (int i = 0; i < num.length * num[0].length; i++) {
			if (i > 6)
				System.out.print(" " + num[i / num.length][i % num.length] + " ");
			else
				System.out.print(num[i / num.length][i % num.length] + " ");

			if ((i + 1) % 4 == 0)
				System.out.println();
		}
	}

	public void practice4() {
		int[][] num = new int[4][4];
		int total = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (i < 3 && j < 3) {
					num[i][j] = (int) (Math.random() * 10) + 1;
				} else if (i < 3 && j == 3) {
					for (int k = 0; k < j; k++) {
						num[i][j] += num[i][k];
					}
					total += num[i][j];
				} else if (i == 3 && j < 3) {
					for (int l = 0; l < i; l++) {
						num[i][j] += num[l][j];
					}
					total += num[i][j];
				} else if (i == 3 && j == 3) {
					num[i][j] = total;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i][j] < 10)
					System.out.print(" " + num[i][j] + " ");
				else
					System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice5() {
		char[][] array = {};
		int num1 = 0;
		int num2 = 0;
		boolean check = true;
		boolean mincheck1 = true;
		boolean mincheck2 = true;

		Scanner sc = new Scanner(System.in);

		while (check) {
			while (mincheck1) {
				System.out.print("행 크기 : ");
				num1 = sc.nextInt();
				if (num1 >= 1 && num1 <= 10) {
					mincheck1 = false;
				} else
					System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}

			while (mincheck2) {
				System.out.print("열 크기 : ");
				num2 = sc.nextInt();
				if (num2 >= 1 && num2 <= 10) {
					mincheck2 = false;
				} else
					System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}

			array = new char[num1][num2];

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = (char) ((int) (Math.random() * 26) + 65);
				}
			}

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}
			check = false;
		}
	}

	public void practice6() {
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}
	}

	public void practice7() {
		char[][] array = {};
		int arrayNum = 0;
		int charNum = 97;

		Scanner sc = new Scanner(System.in);

		System.out.print("행의 크기 : ");
		arrayNum = sc.nextInt();

		array = new char[arrayNum][];

		for (int i = 0; i < array.length; i++) {
			System.out.print(i + "행의 열 크기 : ");
			arrayNum = sc.nextInt();
			array[i] = new char[arrayNum];
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (charNum == 123) {
					charNum = 97;
				}
				array[i][j] = (char) charNum;
				charNum++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice8() {
		String[] std = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
		int stdCon = 0;
		String[][][] array = new String[2][3][2];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					array[i][j][k] = std[stdCon];
					stdCon++;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("== " + (i + 1) + "분단 ==");
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					System.out.print(array[i][j][k] + " ");
				}
				System.out.println();
			}
		}
	}

	public void practice9() {
		String[] std = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
		int stdCon = 0;
		String[][][] array = new String[2][3][2];
		String found = "";

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					array[i][j][k] = std[stdCon];
					stdCon++;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("== " + (i + 1) + "분단 ==");
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					System.out.print(array[i][j][k] + " ");
				}
				System.out.println();
			}
		}
		System.out.println("============================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		found = sc.next();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					if (found.equals(array[i][j][k])) {
						System.out.println("검색하신 " + found + " 학생은 " + (i + 1) + "분단 " + (j + 1) + "번째 줄 "
								+ ((k == 0) ? "왼쪽" : "오른쪽") + "에 있습니다.");
						break;
					}
				}
			}
		}
	}

	public void practice10() {
		String[][] pan = new String[6][6];
		int num1 = 0;
		int num2 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("행 인덱스 입력 : ");
		num1 = sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		num2 = sc.nextInt();

		for (int i = 0; i < pan.length; i++) {
			for (int j = 0; j < pan[i].length; j++) {
				if (i == 0 && j > 0) {
					pan[i][j] = j - 1 + "";
					System.out.print(pan[i][j] + " ");
				} else if (i > 0 && j == 0) {
					pan[i][j] = i - 1 + "";
					System.out.print(pan[i][j] + " ");
				} else if (i == num1 + 1 && j == num2 + 1) {
					pan[i][j] = "X";
					System.out.print(pan[i][j]);
				} else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public void practice11() {
		String[][] pan = new String[6][6];
		int num1 = 0;
		int num2 = 0;

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("행 인덱스 입력 : ");
			num1 = sc.nextInt();
			if(num1==99) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("열 인덱스 입력 : ");
			num2 = sc.nextInt();
			
			for (int i = 0; i < pan.length; i++) {
				for (int j = 0; j < pan[i].length; j++) {
					if (i == 0 && j > 0) {
						pan[i][j] = j - 1 + "";
						System.out.print(pan[i][j] + " ");
					} else if (i > 0 && j == 0) {
						pan[i][j] = i - 1 + "";
						System.out.print(pan[i][j] + " ");
					} else if (i == num1 + 1 && j == num2 + 1) {
						pan[i][j] = "X";
						System.out.print(pan[i][j]);
					} else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
	}
}
