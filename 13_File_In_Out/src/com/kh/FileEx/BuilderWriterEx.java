package com.kh.FileEx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
StringBuilder : 속도가 빠름 
*/

public class BuilderWriterEx {

	public static void main(String[] args) {
		String fileName = "줄.txt";

		StringBuilder builder = new StringBuilder();
		builder.append("첫번째 줄이어라. \n");
		builder.append("두번째 줄이어라. \n");
		builder.append("세번째 줄이어라. \n");

		try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter(fileName));

			/*
			System.nanoTime() : 2024.04.25 09:00:00 부터
			
			1ms 1/1000 초
			1us 1/1000 ms = 1/1000_000
			1ns 1/1000 us = 1/1000_000_000
			*/
			
			long start = System.nanoTime();

			buffer.write(builder.toString());
			buffer.close();

			long end = System.nanoTime();

			System.out.println("파일에 내용을 성공적으로 작성했습니다.");
			System.out.println("총 소요시간 : " + (end - start)+"ns");
		} catch (IOException e) {
			System.out.println("파일에 내용을 작성하지 못했습니다.");
			e.printStackTrace();
		}
	}
}
