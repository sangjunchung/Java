package com.kh.example.practice5.model.vo;

public class Lotto {
	private int[] lotto;
	
	
	public Lotto() {
		lotto = new int[6];
		boolean check = true;
		boolean check2;
		int count = 0;
		
		while(check) {
			check2 = true;
			lotto[count] = (int)(Math.random()*45)+1;
			if(count==0) {
				count++;
				continue;
			}		
			for(int i=0; i<count; i++) {
				if(lotto[i] == lotto[count]) {
					check2 = false;
					break;
				} 	
			}
			if(count<=5 && check2) {
				count++;
			}
			if(count==6) {
				check = false;
			}
		}
	}
	
	public void information() {
		System.out.print("당첨 번호 : ");
		for(int i : lotto) {
			System.out.print(i+" ");
		}
	}
}
