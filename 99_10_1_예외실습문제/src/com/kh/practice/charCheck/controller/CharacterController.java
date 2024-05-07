package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {

	public CharacterController() {

	}

	public int countAlpha(String s) throws CharCheckException {
		int count = 0;

		if (s == null || s.isEmpty()) {
			throw new CharCheckException("입력된 문자열이 비어 있습니다.");
		}
		
		if (s.contains(" ")) {
			throw new CharCheckException("문자열에 공백이 포함되어 있습니다.");
		}
		
		if(s.matches(".*[0-9].*")) {
			throw new CharCheckException("문자열에 숫자가 포함되어 있습니다.");
		}
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				count++;
			}
		}

		return count;
	}
}
