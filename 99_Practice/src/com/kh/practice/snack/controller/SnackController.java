package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	Snack snack = new Snack();
	
	public SnackController() {

	}
	
	public void saveData(String inKind, String inName, String inFlavor, int inNumOf, int inPrice) {
		snack.setInfo(inKind, inName, inFlavor, inNumOf, inPrice);
	}
	
	public void confirmData() {
		snack.getInfo();
	}
}
