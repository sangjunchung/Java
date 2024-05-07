package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.*;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	private int sCount = 0;
	private int eCount = 0;

	public int[] personCount() {
		int[] pCount = { sCount, eCount };

		return pCount;
	}

	public void insertStudent(String inName, int inAge, double inHeight, double inWeight, int inGrade, String inMajor) {
		s[sCount] = new Student(inName, inAge, inHeight, inWeight, inGrade, inMajor);
		sCount++;
	}

	public Student[] printStudent() {
		return s;
	}

	public void insertEmployee(String inName, int inAge, double inHeight, double inWeight, int inSalary,
			String inDept) {
		e[eCount] = new Employee(inName, inAge, inHeight, inWeight, inSalary, inDept);
		eCount++;
	}

	public Employee[] printEmployee() {
		return e;
	}
}
