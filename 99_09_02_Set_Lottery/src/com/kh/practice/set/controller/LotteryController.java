package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();

	public boolean insertObject(Lottery l) {
		for (int i = 0; i < lottery.size(); i++) {
			if (lottery.contains(l)) {// ==
				return true;
			}
		}
		lottery.add(l);
		return false;
	}

	public boolean deleteObject(Lottery l) {
		boolean checkdelete = false;

		for (int i = 0; i < lottery.size(); i++) {
			if (lottery.contains(l)) {
				lottery.remove(l);
				checkdelete = true;
				break;
			}
		}
		for (int i = 0; i < win.size(); i++) {
			if (win.contains(l)) {
				win.remove(l);
				break;
			}
		}

		return checkdelete;
	}

	public HashSet<Lottery> winObject() {
		ArrayList<Lottery> whoWin = new ArrayList<>(lottery);
		
		if (lottery.size() >= 4) {
				while (win.size() < 4) {
					int ranNum = (int)(Math.random()*whoWin.size());
					win.add(whoWin.remove(ranNum));
				}
		} else {
			win.clear();
		}
		return win;
	}

	public TreeSet<Lottery> sortedWinObject() {
		if(win.isEmpty() || win.size()<4) {
			return null;
		}
		TreeSet<Lottery> ts = new TreeSet<>(win);
		return ts;
	}

	public boolean searchWinner(Lottery l) {
		for(Lottery lotte : win) {
			if(lotte.equals(l)) {
				return true;
			}
		}
		return false;
	}
}
