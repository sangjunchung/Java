package com.kh.array.multi;

/*
	다차원 배열 - 2차원 이상의 배열
	배열 요소로 다른 배열을 가지는 배열
	
	ex. 2차원 배열 자료형[][] 배열명 / 자료형 배열명[][] / 자료형[] 배열명[]	

*/

public class MultiArray {
	
	public static void main(String[] args) {
		int[][] numbers = {{1,2,3},{4,5,6},{7,8,9},{10}};
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
		}
	}
}
