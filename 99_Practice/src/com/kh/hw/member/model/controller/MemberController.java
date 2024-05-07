package com.kh.hw.member.model.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	public static final int SIZE = 10;
	Member[] mArray = new Member[SIZE];
	public static int count = 0;

	public int existMemberNum() {
		return count;
	}

	public boolean checkId(String inId) {
		for (int i=0; i<count; i++) {
			if (inId.equals(mArray[i].getId())) {
				return true;
			}
		}
		return false;
	}

	public void insertMember(String inId, String inName, String inPassword, String inEmail, char inGender, int inAge) {
		if (count < SIZE) {
			mArray[count] = new Member(inId, inName, inPassword, inEmail, inGender, inAge);
			count++;
		}
	}

	public String searchId(String inId) {
		for (int i = 0; i < count; i++) {
			if (inId.equals(mArray[i].getId())) {
				System.out.println("찾으신 회원 조회 결과입니다.");
				mArray[i].inform();
			}
		}
		return "검색 결과가 없습니다.";
	}

	public Member[] searchName(String inName) {
		int nameCount = 0;
		Member[] searchName = {};

		for (int i = 0; i < count; i++) {
			if (inName.equals(mArray[i].getName())) {
				nameCount++;
			}
		}
		if(nameCount == 0) {
			searchName = null;
			return searchName;
		}
		searchName = new Member[nameCount];
		nameCount = 0;
		for (int i = 0; i < count; i++) {
			if (inName.equals(mArray[i].getName())) {
				searchName[nameCount] = mArray[i];
				nameCount++;
			}
		}
		return searchName;
	}

	public Member[] searchEmail(String inEmail) {
		int emailCount = 0;
		Member[] searchEmail = {};
		
		for (int i = 0; i < count; i++) {
			if (inEmail.equals(mArray[i].getEmail())) {
				emailCount++;
			}
		}
		if(emailCount == 0) {
			searchEmail = null;
			return searchEmail;
		}
		searchEmail = new Member[emailCount];
		emailCount = 0;
		for (int i = 0; i < count; i++) {
			if (inEmail.equals(mArray[i].getEmail())) {
				searchEmail[emailCount] = mArray[i];
				emailCount++;
			}
		}
		return searchEmail;
	}

	public boolean updatePassword(String inId, String inPassword) {
		return true;
	}

	public boolean updateName(String inId, String inName) {
		return true;
	}

	public boolean updateEmail(String inId, String inEmail) {
		return true;
	}

	public boolean delete(String inId) {
		return true;
	}

	public void delete() {

	}

	public Member[] printAll() {
		return mArray;
	}

}
