package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student sdt1 = new Student();
		sdt1.information();
		
		sdt1.setStudent(3, 5, "홍길동", 75.5, '남');
		sdt1.information();
	}

}
