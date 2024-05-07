package com.kh.inheritance.ex;

public class Smartphone {
	private String screen;
	private String newsAgency;
	private String CPU;

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public void setNewsAgency(String newsAgency) {
		this.newsAgency = newsAgency;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}

	public String getScreen() {
		return screen;
	}

	public String getNewsAgency() {
		return newsAgency;
	}

	public String getCPU() {
		return CPU;
	}

	public Smartphone() {

	}

	public Smartphone(String inScreen, String inNewsAgency, String inCPU) {
		this.screen = inScreen;
		this.newsAgency = inNewsAgency;
		this.CPU = inCPU;
	}

	@Override
	public String toString() {
		return "스마트폰 [화면=" + screen + ", 통신사=" + newsAgency + ", 성능=" + CPU + "]";
	}
}
