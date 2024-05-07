package com.kh.inheritance.ex;

public class iPhone extends Smartphone {
	private int IOS;

	public void setIOS(int iOS) {
		IOS = iOS;
	}

	public int getIOS() {
		return IOS;
	}

	public iPhone() {

	}

	public iPhone(String inScreen, String inNewsAgency, String inCPU, int inIOS) {
		super(inScreen, inNewsAgency, inCPU);
		this.IOS = inIOS;
	}

	@Override
	public String toString() {
		return "아이폰 버전 : " + IOS + " / " + super.toString();
	}
}
