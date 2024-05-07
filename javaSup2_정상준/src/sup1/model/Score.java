package sup1.model;

public class Score {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;

	public Score(int inKor, int inEng, int inMath) {
		this.kor = inKor;
		this.eng = inEng;
		this.math = inMath;
	}

	public void result() {
		total = kor + eng + math;
		avg = total / 3.0;

		System.out.println((avg >= 70) ? "합격입니다." : "불합격입니다.");
	}
}
