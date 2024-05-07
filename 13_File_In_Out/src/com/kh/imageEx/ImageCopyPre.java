package com.kh.imageEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageCopyPre {

	public static void main(String[] args) {

		String hogam = "src/com/kh/imageEx/hogam.jpg";
		String hogam_cute = "src/com/kh/imageEx/hogam_cute.jpg";

		try {
			FileInputStream fileRead = new FileInputStream(hogam);
			FileOutputStream fileWrite = new FileOutputStream(hogam_cute);

			byte[] buffer = new byte[1024];
			int length;

			while ((length = fileRead.read(buffer)) > 0) {
				fileWrite.write(buffer, 0, length);
			}
			fileRead.close();
			fileWrite.close();
			
			System.out.println("이미지 복사에 성공하셨습니다.");
		} catch (Exception e) {
			System.out.println("이미지 복사에 실패하였습니다.");
			e.printStackTrace();
		}

	}
}
