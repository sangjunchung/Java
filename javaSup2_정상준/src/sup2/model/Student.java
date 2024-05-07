package sup2.model;

public class Student {
	private String name;
	private int grade;
	private int classNum;
	private int number;
	private char gender;
	private double score;

	public Student(String inName, int inGrade, int inClassNum, int inNumber, char inGender, double inScore) {
		this.name = inName;
		this.grade = inGrade;
		this.classNum = inClassNum;
		this.number = inNumber;
		this.gender = inGender;
		this.score = inScore;
	}

	public void information() {
		String toGender = (gender == 'M') ? "남학생" : "여학생";
		
		System.out.println();
		System.out.println(
				grade + "학년 " + classNum + "반 " + number + "번 " + toGender + " " + name + "는 성적이 " + score + "점이다.");
	}
}
