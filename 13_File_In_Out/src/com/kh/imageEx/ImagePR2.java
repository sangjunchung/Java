package com.kh.imageEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ImagePR2 {
	
	public static void main(String[] args) {
		File image = new File(System.getProperty("user.home")+"/Desktop/image");
		
		image.mkdir();
		
		File animal = new File(image+"/animal.txt");
		
		try {
			// FileWriter 는 글쓰는건 편리하지만 파일의 이름을 비교하거나 다른 작업은 하기 어려움
			FileWriter fw = new FileWriter(animal);
			fw.write("소\n");
			fw.write("고양이\n");
			fw.write("돼지\n");
			fw.write("토끼\n");
			fw.write("호랑이\n");
			fw.write("소\n");
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		if(image.exists()) {
			image.renameTo(new File(System.getProperty("user.home")+"/Desktop/class"));
		}
		// 폴더 안에 파일 존재시 폴더 삭제 동작 안함
		animal.delete();
		if(image.delete()) {
			System.out.println("success");
		}else {
			System.out.println("fail");
		}
		
	}
}
