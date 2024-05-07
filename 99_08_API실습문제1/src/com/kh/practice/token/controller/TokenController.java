package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {

	}

	public String afterToken(String str) {
		String result = "";
		StringTokenizer token = new StringTokenizer(str);

		while (token.hasMoreTokens()) {
			result += token.nextToken();
		}

		return result;
	}

	public String firstCap(String input) {
		String first = input.substring(0, 1);
		String remain = input.substring(1);
		first = first.toUpperCase();
		return first + remain;
	}

	public int findChar(String input, char one) {
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			if (one == input.charAt(i)) {
				count++;
			}
		}

		return count;
	}
}
