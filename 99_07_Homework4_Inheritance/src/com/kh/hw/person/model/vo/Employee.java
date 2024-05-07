package com.kh.hw.person.model.vo;

public class Employee extends Person {
	private int salary;
	private String dept;

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public String getDept() {
		return dept;
	}

	public Employee() {

	}

	public Employee(String inName, int inAge, double inHeight, double inWeight, int inSalary, String inDept) {
		super(inName, inAge, inHeight, inWeight);
		this.salary = inSalary;
		this.dept = inDept;
	}

	public String toString() {
		return super.toString() + ", 급여 : " + salary + ", 부서 : " + dept;
	}
}
