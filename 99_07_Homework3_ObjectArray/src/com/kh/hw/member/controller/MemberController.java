package com.kh.hw.member.controller;

import java.util.ArrayList;
import java.util.Arrays;
import com.kh.hw.member.model.vo.Member;

public class MemberController {
	public final static int SIZE = 10;
	private static int memberCount = 0;
	private Member[] m = new Member[SIZE];

	public int existMemberNum() {
		return memberCount;
	}

	public boolean checkId(String inId) {
		for (int i = 0; i < memberCount; i++) {
			if (inId.equals(m[i].getId())) {
				return true;
			}
		}
		return false;
	}

	public void insertMember(String inId, String inName, String inPassword, String inEmail, char inGender, int inAge) {
		if (memberCount < SIZE) {
			m[memberCount] = new Member(inId, inName, inPassword, inEmail, inGender, inAge);
			memberCount++;
		} else {
			System.out.println("더 이상 회원을 등록할 수 없습니다.");
		}
	}

	public String searchId(String inId) {
		for (int i = 0; i < memberCount; i++) {
			if (inId.equals(m[i].getId())) {
				return m[i].inform();
			}
		}
		return "";
	}

	public Member[] searchName(String inName) {
		ArrayList<Member> nameList = new ArrayList<>();
		boolean checkNameMember = false;
		Member[] nameArray;

		for (int i = 0; i < memberCount; i++) {
			if (inName.equals(m[i].getName())) {
				nameList.add(m[i]);
				checkNameMember = true;
			}
		}
		if (checkNameMember) {
			nameArray = nameList.toArray(new Member[nameList.size()]);
		} else {
			nameArray = null;
		}
		return nameArray;
	}

	public Member[] searchEmail(String inEmail) {
		ArrayList<Member> emailList = new ArrayList<>();
		boolean checkEmailMember = false;
		Member[] emailArray;

		for (int i = 0; i < memberCount; i++) {
			if (inEmail.equals(m[i].getEmail())) {
				emailList.add(m[i]);
				checkEmailMember = true;
			}
		}
		if (checkEmailMember) {
			emailArray = emailList.toArray(new Member[emailList.size()]);
		} else {
			emailArray = null;
		}
		return emailArray;
	}

	public boolean updatePassword(String inId, String inPassword) {
		for (int i = 0; i < memberCount; i++) {
			if (inId.equals(m[i].getId())) {
				m[i].setPassword(inPassword);
				return false;
			}
		}
		return true;
	}

	public boolean updateName(String inId, String inName) {
		for (int i = 0; i < memberCount; i++) {
			if (inId.equals(m[i].getId())) {
				m[i].setName(inName);
				return false;
			}
		}
		return true;
	}

	public boolean updateEmail(String inId, String inEmail) {
		for (int i = 0; i < memberCount; i++) {
			if (inId.equals(m[i].getId())) {
				m[i].setEmail(inEmail);
				return false;
			}
		}
		return true;
	}

	public boolean delete(String inId) {
		ArrayList<Member> deleteList = new ArrayList<>(Arrays.asList(m));
		boolean checkDelete = true;

		for (int i = 0; i < memberCount; i++) {
			if (inId.equals(m[i].getId())) {
				deleteList.remove(i);
				memberCount--;
				checkDelete = false;
			}
		}
		if (checkDelete == false) {
			m = deleteList.toArray(new Member[SIZE]);
		}
		return checkDelete;
	}

	public void delete() {
		m = new Member[SIZE];
		memberCount = 0;
	}

	public Member[] printAll() {
		return m;
	}
}
