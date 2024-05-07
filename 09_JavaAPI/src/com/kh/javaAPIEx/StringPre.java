package com.kh.javaAPIEx;

public class StringPre {

	public static void main(String[] args) {
		String test1 = "Today is a beautiful day.";
		String test2 = "Programming is fun and challenging.";
		String test3 = "Learning new things is exciting.";
		String test4 = "A good medicin tastes bitter.";
		String test5 = "The more, the better.";
		String test6 = "Walls have ears.";
		String test7 = "Every dog has his day.";

		String sub1 = test1.substring(0, 5);
		String up1 = test2.toUpperCase();
		String low1 = test3.toLowerCase();
		String[] spl1 = test4.split(" ");
		String rep1 = test5.replace("more", "less");
		char ch1 = test6.charAt(6);
		String sub2 = test7.substring(14);

		System.out.println(sub1);
		System.out.println(up1);
		System.out.println(low1);
		System.out.println("======================");
		for (String st : spl1) {
			System.out.println(st);
		}
		System.out.println("======================");
		System.out.println(rep1);
		System.out.println(ch1);
		System.out.println(sub2);
	}
}
