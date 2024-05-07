package com.kh.practice.score.controller;

import java.io.DataInputStream;

import com.kh.practice.score.model.dao.ScoreDAO;

public class ScoreController {
	private ScoreDAO sd = new ScoreDAO();
	
	public void saveScore(String inName, int inKor, int inEng, int inMath, int inSum, double inAvg) {
		sd.saveScore(inName, inKor, inEng, inMath, inSum, inAvg);
	}
	
	public DataInputStream readScore() throws Exception {
		return sd.readScore();
	}
	
}
