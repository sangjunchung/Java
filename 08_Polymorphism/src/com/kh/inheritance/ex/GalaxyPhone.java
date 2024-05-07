package com.kh.inheritance.ex;

public class GalaxyPhone extends Smartphone {
	private int AOS;

	public void setAOS(int aOS) {
		AOS = aOS;
	}

	public int getAOS() {
		return AOS;
	}

	public GalaxyPhone() {

	}

	public GalaxyPhone(String inScreen, String inNewsAgency, String inCPU, int inAOS) {
		super(inScreen, inNewsAgency, inCPU);
		this.AOS = inAOS;
	}

	@Override
	public String toString() {
		return "안드로이드 버전 : " + AOS + " / " + super.toString();
	}
}
