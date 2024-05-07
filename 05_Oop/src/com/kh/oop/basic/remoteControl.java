package com.kh.oop.basic;

public class remoteControl {
	public boolean powerOn;
	public int volume;
	
	public remoteControl() {
		
	}
	
	public remoteControl(int inVol) {
		this.volume = inVol;
	}
	
	public void status() {
		System.out.println("음량 : "+volume);
	}
	
	public static void main(String[] args) {
		remoteControl rC = new remoteControl();
		rC.volume = 200;
		rC.status();
		
		remoteControl rC2 = new remoteControl(200);
		rC2.status();
	}
}
