package com.kh.ThreadPre;

public class PriorityThread {

	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {
			ThreadPractice n = new ThreadPractice(i);
			
			if(i==0) {
				n.setPriority(Thread.MAX_PRIORITY);
			} else if(i==1) {
				n.setPriority(Thread.NORM_PRIORITY);
			} else {
				n.setPriority(Thread.MIN_PRIORITY);
			}
			
			n.start();
		}
	}
}
