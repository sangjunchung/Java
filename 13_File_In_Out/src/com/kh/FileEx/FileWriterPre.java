package com.kh.FileEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPre {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("Hello World.txt", true);
			
			writer.write("나는 자바가 너무 재밌다");
			writer.write("자바는 정말정말 재밌다.");
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
