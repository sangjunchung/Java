package ncs.test4;

import java.util.*;

public class TestSort {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();

		while (set.size() < 11) {
			set.add((int) ((Math.random() * 50) + 51));
		}
		Integer[] array = set.toArray(new Integer[set.size()]);
		
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print("before : " + array[i] + ", ");
			} else if (i == array.length - 1) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ", ");
			}
		}	
		Arrays.sort(array, Comparator.reverseOrder());
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print("After : " + array[i] + ", ");
			} else if (i == array.length - 1) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ", ");
			}
		}
	}
}
