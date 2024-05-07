package com.kh.FileEx;

import java.io.File;
import java.io.IOException;

public class FilePre {

	public FilePre() {

	}

	public void method1() {
		File createNote = new File("c:/Users/user1/Desktop/newFFF/newFile.txt");

		if (createNote.exists()) {
			System.out.println("해당 파일은 이미 존재합니다.");
		} else {
			try {
				createNote.createNewFile();
				System.out.println(createNote.getName() + " 파일이 생성되었습니다.");
			} catch (IOException e) {
				System.out.println("파일 생성에 실패하였습니다.");
				e.printStackTrace();
			}
		}
	}

	public void method2() {
		String fPath = "c:/Users/user1/Desktop/newFolder";
		File createfolder = new File(fPath);
		File createFile = new File(fPath + "/newFile2.txt");

		// 바탕화면 경로 설정하는 방법 c:/Users/user1
		String desktopPath = System.getProperty("user.home") + "/Desktop";
		System.out.println(desktopPath);

		if (createFile.exists()) {
			System.out.println("해당 파일은 이미 존재합니다.");
		} else {
			try {
				createfolder.mkdir();
				createFile.createNewFile();
				System.out.println(createFile.getName() + " 파일이 생성되었습니다.");
			} catch (Exception e) {
				System.out.println("파일 생성에 실패하였습니다.");
				e.printStackTrace();
			}

		}
	}

	public void method3() {
		String desktopPath = System.getProperty("user.home") + "/Desktop";

		File fds = new File(desktopPath + "/new1/new2/new3");
		fds.mkdirs();

		File nfile = new File(fds + "/nfile.txt");
		try {
			boolean checknfile = nfile.createNewFile();
			System.out.println(nfile.getName() + " 파일이 생성되었나요? " + checknfile);

			System.out.println(nfile.length());
			System.out.println(nfile.lastModified());
			nfile.delete();

		} catch (IOException e) {
			System.out.println("파일 생성 실패");
			e.printStackTrace();
		}
	}

	public void method4() {
		String desktopPath = System.getProperty("user.home") + "/Desktop";
		File nfile = new File(desktopPath + "/newFFF/changeName.txt");

		try {
			nfile.createNewFile();
			System.out.println("파일 생성 성공");
		} catch (IOException e) {
			System.out.println("파일 생성 실패");
			e.printStackTrace();
		}
	}

	public void method5() {
		String desktopPath = System.getProperty("user.home") + "/Desktop";
		File nfile = new File(desktopPath + "/newFFF/changeName.txt");
		File newName = new File(desktopPath + "/newFFF/changedName.txt");
		
		if(nfile.exists()) {
			if(nfile.renameTo(newName)) {
				System.out.println("파일 이름이 성공적으로 변경되었습니다.");
			} else {
				System.out.println("파일 이름 변경에 실패했습니다.");
			}
		} else {
			System.out.println("파일 이름이 존재하지 않습니다. 만들어주세요^^.");
			
		}
	}

	public static void main(String[] args) {
		FilePre file = new FilePre();
		// file.method1();
		// file.method2();
		// file.method3();
		// file.method4();
		file.method5();

	}
}
