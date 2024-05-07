package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/*
BufferedImage : 이미지 데이터를 저장하고 처리하는데 사용

Image : 인터페이스로 이미지를 표현하는 추상화된 개념을 제공

ImageIO : 이미지를 파일로부터 읽고 출력하는 이미지In/Out
*/

public class ImageResize {

	public static void main(String[] args) {

		String origImage = "src/com/kh/imageEx/marley.jpg";
		String resizeImage = "src/com/kh/imageEx/marley_cute.jpg";

		int width = 200;
		int heigth = 200;

		try {
			BufferedImage origDate = ImageIO.read(new File(origImage));
			BufferedImage resizeDate = new BufferedImage(width, heigth, BufferedImage.TYPE_INT_RGB);
			
			Image drawImage = origDate.getScaledInstance(width, heigth, Image.SCALE_SMOOTH);
			
			resizeDate.createGraphics().drawImage(drawImage, 0, 0, null);
			
			ImageIO.write(resizeDate, "jpg", new File(resizeImage));
			
			System.out.println("파일 크기 조절에 성공하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 크기 조절에 실패하였습니다.");
			e.printStackTrace();
		}
	}
}
