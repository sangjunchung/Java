package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.*;

public class PhoneController {

	public String[] method() {
		Phone[] result = new Phone[2];
		result[0] = new GalaxyNote9();
		result[1] = new V40();

		String[] printInfo = new String[7];
		
		int num = (int)(Math.random() * 100) + 1;

		if (num % 2 == 0) {
			GalaxyNote9 g9 = (GalaxyNote9) result[0];
			printInfo = g9.printInformation().split("/");
		} else {
			V40 v40 = (V40) result[1];
			printInfo = v40.printInformation().split("/");
		}
		return printInfo;
	}
}
