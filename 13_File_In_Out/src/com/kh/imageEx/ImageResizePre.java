package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageResizePre {
	
	public static void main(String[] args) {
		String origImage = "src/com/kh/imageEx/Pig.jpg";
		String resizeImage = "src/com/kh/imageEx/Pig_smart.jpg";
		
		int width = 400;
		int height = 200;
		
		try {
			BufferedImage origDate = ImageIO.read(new File(origImage));
			BufferedImage resizeDate = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			
			Image drawImage = origDate.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			
			resizeDate.createGraphics().drawImage(drawImage, 0, 0, null);
			
			ImageIO.write(resizeDate, "jpg", new File(resizeImage));
			
			System.out.println("이미지 크기 조정에 성공하였습니다.");
		} catch (IOException e) {
			System.out.println("이미지 크기 조정에 실패하였습니다.");
			e.printStackTrace();
		}
	}
}
