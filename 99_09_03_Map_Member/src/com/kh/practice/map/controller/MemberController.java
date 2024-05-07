package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	private HashMap<String, Member> map = new HashMap<>();
	
	public boolean joinMembership(String inId, Member m) {
		if(map.containsKey(inId)) {
			return false;
		}
		map.put(inId, m);
		return true;
	}
	
	public String login(String inId, String inPassword) {
		for(String cId : map.keySet()) {
			if(cId.equals(inId) && map.get(cId).getPassword().equals(inPassword)) {
				return map.get(cId).getName();
			}
		}
		return null;
	}
	
	public boolean changePassword(String inId, String oldPW, String newPW) {
		for(String cp : map.keySet()) {
			if(cp.equals(inId) && map.get(inId).getPassword().equals(oldPW)) {
				map.get(inId).setPassword(newPW);
				return true;
			}
		}
		return false;
	}
	
	public void changeName(String inId, String newName) {
		if(map.containsKey(inId)) {
			map.get(inId).setName(newName);
			System.out.println("이름 변경에 성공했습니다.");
		}
	}
	
	public TreeMap<String, String> sameName(String inName) {
		TreeMap<String, String> tree = new TreeMap<>();
		for(String str : map.keySet()) {
			if(map.get(str).getName().equals(inName)) {
				tree.put(str, map.get(str).getName());
			}
		}
		return tree;
	}
}
