package com.kh.IteratorEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorPre {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(100, 10, 20, 30 ,50, 70));
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
