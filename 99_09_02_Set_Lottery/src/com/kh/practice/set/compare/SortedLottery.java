package com.kh.practice.set.compare;

import java.util.Comparator;

import com.kh.practice.set.model.vo.Lottery;

public class SortedLottery implements Comparator<Lottery> {

	@Override
	public int compare(Lottery o1, Lottery o2) {
		return o2.getName().compareTo(o1.getName());
	}
}
