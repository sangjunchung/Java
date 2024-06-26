package array;

import java.util.Arrays;

public class Test9 {
	
	public static void main(String[] args) {
		int[][] array = { { 12, 41, 36, 56 }, { 82, 10, 12, 61 }, { 14, 16, 18, 78 }, { 45, 26, 72, 23 } };
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				count++;
			}
		}
		
		int[] newArray = new int[count];
		count = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				newArray[count++] = array[i][j];
			}
		}
		Arrays.sort(newArray);
		
		System.out.println("가장 큰 값 : "+newArray[newArray.length-1]);
		System.out.println("가장 작은 값 : "+newArray[0]);
	}
}
