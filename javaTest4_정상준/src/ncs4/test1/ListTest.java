package ncs4.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest {
	
	public static void display(List<Integer> list) {
		for(int i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Random rd = new Random();
		Decending dc = new Decending();
		List<Integer> list = new ArrayList<>();
		
		while(list.size() < 11) {
			list.add(rd.nextInt(100)+1);
		}
		System.out.print("정렬 전 : ");
		display(list);
		
		list.sort(dc);
		
		System.out.print("정렬 후 : ");
		display(list);
	}
}
