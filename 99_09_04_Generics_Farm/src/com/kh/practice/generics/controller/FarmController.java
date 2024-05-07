package com.kh.practice.generics.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.practice.generics.model.vo.Farm;

public class FarmController {
	private HashMap<Farm, Integer> hMap = new HashMap<>();
	private ArrayList<Farm> list = new ArrayList<>();

	public boolean addNewKind(Farm f, int amount) {
		if (hMap.containsKey(f)) {
			return false;
		}
		hMap.put(f, amount);
		return true;
	}

	public boolean removeKind(Farm f) {
		if (hMap.containsKey(f)) {
			hMap.remove(f);
			return true;
		}
		return false;
	}

	public boolean changeAmount(Farm f, int amount) {
		if (hMap.containsKey(f)) {
			hMap.put(f, amount);
			return true;
		}
		return false;
	}

	public HashMap<Farm, Integer> printFarm() {
		return hMap;
	}

	public boolean buyFarm(Farm f) {
		if (hMap.containsKey(f) && hMap.get(f) > 0) {
			list.add(f);
			hMap.put(f, hMap.get(f) - 1);
			return true;
		}
		return false;
	}

	public boolean removeFarm(Farm f) {
		for (Farm a : list) {
			if (a.equals(f)) {
				list.remove(a);
				hMap.put(f, hMap.get(f) + 1);
				return true;
			}
		}
		return false;
	}

	public ArrayList<Farm> printBuyFarm() {
		return list;
	}
}
