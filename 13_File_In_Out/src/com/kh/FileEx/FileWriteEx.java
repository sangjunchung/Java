package com.kh.FileEx;

import java.io.FileWriter;
import java.io.IOException;

/*
FileWriter : 파일의 문자를 쓰기 위한 객체
	파일이 없다면 파일을 생성하고 파일에 데이터를 바로 쓸 수 있음

메서드
write() : 작성하고싶은 내용을 파일안에 작성
flush() : 스트림을 비우고 모든 데이터를 출력 (없어도 작성은 가능함)
close() : 쓰고있는 파일을 닫음
*/

public class FileWriteEx {

	public static void main(String[] args) {
											// 파일 이름 앞에 주소가 없으면 현재 자바 코드를 작성하는 폴더 바로 밑에 생성
		try { 								// "파일명.확장자"  뒤에 true 를 붙이면 이어서 작성, 없으면 덮어쓰기
			FileWriter write = new FileWriter("예제파일.txt");
			
			write.write("안녕하세요. 환영합니다.");
			write.close();
			
			System.out.println("글쓰기 완료");
		} catch (IOException e) {
			System.out.println("글쓰기 실패");
			e.printStackTrace();
		}
	}
}
