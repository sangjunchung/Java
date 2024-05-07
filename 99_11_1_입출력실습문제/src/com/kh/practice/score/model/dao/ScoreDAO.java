package com.kh.practice.score.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ScoreDAO {
	private final String FILE_PATH = "score.txt";
	
	public void saveScore(String inName, int inKor, int inEng, int inMath, int inSum, double inAvg) {
		//try로 시작하기 전에 정의를 내리고 들어가겠다는 의미
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_PATH, true))){
			dos.writeUTF(inName);
			dos.writeInt(inKor);
			dos.writeInt(inEng);
			dos.writeInt(inMath);
			dos.writeInt(inSum);
			dos.writeDouble(inAvg);
			System.out.println("점수가 성공적으로 저장되었습니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public DataInputStream readScore() throws Exception {
		return new DataInputStream(new FileInputStream(FILE_PATH));
	}
}
