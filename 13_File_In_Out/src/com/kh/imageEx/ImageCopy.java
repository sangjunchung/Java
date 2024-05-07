package com.kh.imageEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
이미지를 복사하기 위해서는 원본 이미지 파일 경로와 옮기고 싶은 이미지 파일 경로를 설정  

File : 파일을 읽고 쓰고 가져오고 사용하는데 쓰이는 객체

FileInputStream : 파일의 데이터를 읽어오는데 사용
	read() : 데이터를 읽어옴

FileOutputStream : 파일의 데이터를 내보내는데 사용
	write() : 데이터를 사용


*/

public class ImageCopy {

	public static void main(String[] args) {
		// 자바 코드에서 폴더 구분을 작성할 때는 / 로 작성
		// 모든 파일의 실행은 src로 부터 시작을 함
		String origImage = "src/com/kh/imageEx/healing.jpg";
		String copyImage = "src/com/kh/imageEx/healing_cute.jpg";

		try {
			FileInputStream fileRead = new FileInputStream(origImage);
			FileOutputStream fileWrite = new FileOutputStream(copyImage);

			// 버퍼를 통해 데이터를 읽고 쓰기위한 배열 설정
			byte[] buffer = new byte[1024];
			int length;

			// 버퍼 배열을 통해서 원본 파일로부터 데이터를 읽어와 복사할 파일에 사용
			// while 문을 사용해서 이미지 0부터 끝까지 가지고옴
			while ((length = fileRead.read(buffer)) > 0) {
				fileWrite.write(buffer, 0, length);
			}

			fileRead.close();
			fileWrite.close();

			System.out.println("이미지 복사가 완료되었습니다.");
		} catch (Exception e) {
			System.out.println("이미를 복사 중 오류가 발생했습니다.");
			e.printStackTrace();
		}
	}
}
