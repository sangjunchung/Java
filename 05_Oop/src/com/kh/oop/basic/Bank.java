package com.kh.oop.basic;

public class Bank {
	public	String	name;
	public	String	accountNum;
	public	int		balance;
	public 	String	password;
	public 	boolean	agreel;
	
	public Bank() {
		
	}
	
	public Bank(String inName, String inAccountNum, int inBalance, String inPassword) {
		this.name = inName;
		this.accountNum = inAccountNum;
		this.balance = inBalance;
		this.password = inPassword;
	}
	
	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("계좌번호 : "+accountNum);
		System.out.println("잔액 : "+balance);
		System.out.println("비밀번호 : "+password);
		System.out.println("마케팅수신동의 : "+agreel);
	}
	
	public static void main(String[] args) {
		Bank customer1 = new Bank();
		customer1.name = "Jor";
		customer1.accountNum = "123-123-1234";
		customer1.balance = 10000;
		customer1.password = "1541";
		customer1.agreel = true;
		customer1.info();
		
		Bank customer2 = new Bank("Park", "111-222-3333", 123, "0000");
		customer2.agreel = true;
		customer2.info();
	}
}
