package com.kh.example.practice7.model.vo;

public class Employee {
	int empNo;
	String empName;
	String dept;
	String job;
	int age;
	char gender;
	int salary;
	double bonusPoint;
	String phone;
	String address;
	
	public Employee() {
		
	}
	
	public Employee(int inEmpNo, String inEmpName) {
		this.empName = inEmpName;
		this.empNo = inEmpNo;
	}
	
	public Employee(int inEmpNo, String inEmpName, String inDept, String inJob, int inAge, 
			char inGender, int inSalary, double inBonusPoint, String inPhone, String inAddress) {
		this.empName = inEmpName;
		this.empNo = inEmpNo;
		this.dept = inDept;
		this.job = inJob;
		this.age = inAge;
		this.gender = inGender;
		this.salary = inSalary;
		this.bonusPoint = inBonusPoint;
		this.phone = inPhone;
		this.address = inAddress;
	}
	
	public void getEmp() {
		System.out.println("empNo : "+empNo);
		System.out.println("empName : "+empName);
		System.out.println("dept : "+dept);
		System.out.println("job : "+job);
		System.out.println("age : "+age);
		System.out.println("gender : "+gender);
		System.out.println("salary : "+salary);
		System.out.println("bonusPoint : "+bonusPoint);
		System.out.println("phone : "+phone);
		System.out.println("address : "+address);
	}
	
	public void setEmp(int inEmpNo, String inEmpName, String inDept, String inJob, int inAge, 
			char inGender, int inSalary, double inBonusPoint, String inPhone, String inAddress) {
		this.empName = inEmpName;
		this.empNo = inEmpNo;
		this.dept = inDept;
		this.job = inJob;
		this.age = inAge;
		this.gender = inGender;
		this.salary = inSalary;
		this.bonusPoint = inBonusPoint;
		this.phone = inPhone;
		this.address = inAddress;
	}
}
