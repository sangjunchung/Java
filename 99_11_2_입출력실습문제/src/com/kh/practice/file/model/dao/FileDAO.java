package com.kh.practice.file.model.dao;

import java.util.*;

public class FileDAO {
	private Map<String, String> files = new HashMap<>();

	public boolean checkName(String file) {
		return files.containsKey(file);
	}

	public void fileSave(String file, String s) {
		files.put(file, s);
		System.out.println("파일 저장 완료 : " + file);
	}

	public StringBuilder fileOpen(String file) {
		if (files.containsKey(file)) {
			System.out.println("파일 열기 완료 : " + file);
			return new StringBuilder(files.get(file));
		} else {
			System.out.println("파일이 존재하지 않습니다.");
			return null;
		}
	}

	public void fileEdit(String file, String s) {
		if (files.containsKey(file)) {
			files.put(file, s);
			System.out.println("파일 수정 완료 : " + file);
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}
}
