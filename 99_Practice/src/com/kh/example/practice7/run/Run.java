package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.setEmp(1, "김철수", "사업부", "사장", 50, '남', 5_000_000, 1.5, "010-1234-7890", "서울시 강남구");
		emp1.getEmp();
		
		Employee emp2 = new Employee(100, "홍길동", "영업부", "과장", 25, '남', 2_500_000, 0.05, "010-1234-5678", "서울시 강남구");
		
		emp2.getEmp();
		
		Employee emp3 = new Employee(101, "박영희");
		emp3.getEmp();
		
	}
}
