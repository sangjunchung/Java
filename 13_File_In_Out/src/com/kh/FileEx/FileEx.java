package com.kh.FileEx;

import java.io.File;

/*
제일 중요한 함수 : write close exists mkdir

File 파일이나 폴더(디렉토리) 를 관리하는 클래스
	 파일 생성, 제거, 이름, 크기, 마지막 수정일, 존재여부 등의 기능을 제공
메서드
	boolean mkdir() : 폴더 생성
	boolean mkdirs() : 경로로 지정해준 모든 폴더 생성
	boolean createNewFile() : 파일 생성
	boolean delete : 파일이나 폴더 삭제
	String getName() : 파일 이름 보여줌
	String parent() : 파일이 저장된 폴더를 알려줌
	String getPath() : 폴더 전체 경로 확인
	boolean isFile() : 현재 File 객체가 관리하는게 파일이면 true 아니면 false
	boolean isDirectory() : 현재 File 객체가 관리하는게 폴더이면 true 아니면 false
	boolean exists() : 파일이나 폴더가 존재한다면 true, 없다면 false
	long length() : 파일 크기 알려줌
	long lastModified() : 파일 마지막 수정일 알려줌
	String[] list() : 폴더 내 파일 목록을 String[] 배열로 보여줌
	File[] listFiles() : 폴더 내 파일 목록을 File[] 배열로 보여줌
	
[개발자 상식]
OS : 컴퓨터가 윈도우인지 리눅스인지 맥북인지 나타내는 운영체제

윈도우	|	리눅스	|  맥북
 폴더  	|   디렉토리	| 디렉토리
-경로 표기방법 (폴더 경로, 파일위치 표시)
 \   	|	  /		|   /
-java 언어는 \ , / 관계없이 모두 경로로 표시 가능하게 설정이 되어 있음

경로	절대경로 : c:/ 부터 시작해서 모두 작성해주는 경로
	상대경로 : 내가 위치한 폴더나 파일 기준으로 폴더를 작성해주는 것
			./ : 현재 내 폴더 위치를 나타냄
			../ : 현재 내 폴더에서 한단계 더 상위폴더로 이동하는 것을 의미
*/

public class FileEx {
	
	public static void main(String[] args) {
		File createFolder = new File("c:/Users/user1/Desktop/newFFF");
		
		System.out.println(createFolder.exists());
		
		if(createFolder.exists()) {
			System.out.println("이미 바탕화면에 존재합니다.");
		} else {
			System.out.println("폴더가 존재하지 않습니다.");
			System.out.println("새로운 폴더를 만듭니다.");
			createFolder.mkdir();
			System.out.println(createFolder.getName());
			System.out.println(createFolder.getPath());
		}
	}
}
