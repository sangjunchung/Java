package ncs.test7;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ScoreFrame extends JFrame {
	private JTextField javaScore, sqlScore;
	private JTextField total, average;
	private JButton calcBtn;
	
	public void setJavaScore(JTextField javaScore) {
		this.javaScore = javaScore;
	}

	public void setSqlScore(JTextField sqlScore) {
		this.sqlScore = sqlScore;
	}

	public void setTotal(JTextField total) {
		this.total = total;
	}

	public void setAverage(JTextField average) {
		this.average = average;
	}

	public void setCalcBtn(JButton calcBtn) {
		this.calcBtn = calcBtn;
	}

	public JTextField getJavaScore() {
		return javaScore;
	}

	public JTextField getSqlScore() {
		return sqlScore;
	}

	public JTextField getTotal() {
		return total;
	}

	public JTextField getAverage() {
		return average;
	}

	public JButton getCalcBtn() {
		return calcBtn;
	}

	public ScoreFrame() {
		this.setTitle("문제 7");
		this.setLayout(null);
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel tip = new JLabel("점수를 입력하세요");
		tip.setFont(tip.getFont().deriveFont(40.0f));
		JLabel java = new JLabel("자바:");
		java.setFont(java.getFont().deriveFont(15.0f));
		javaScore = new JTextField();
		JLabel sql = new JLabel("SQL:");
		sql.setFont(sql.getFont().deriveFont(15.0f));
		sqlScore = new JTextField();
		JLabel sum = new JLabel("총점:");
		sum.setFont(sum.getFont().deriveFont(15.0f));
		total = new JTextField();
		JLabel avg = new JLabel("평균:");
		avg.setFont(avg.getFont().deriveFont(15.0f));
		average = new JTextField();

		this.add(tip);
		tip.setLocation(20, 5);
		tip.setSize(350, 40);

		this.add(java);
		java.setLocation(20, 60);
		java.setSize(50, 30);

		this.add(javaScore);
		javaScore.setLocation(65, 60);
		javaScore.setSize(100, 30);

		this.add(sql);
		sql.setLocation(200, 60);
		sql.setSize(50, 30);

		this.add(sqlScore);
		sqlScore.setLocation(245, 60);
		sqlScore.setSize(100, 30);

		calcBtn = new JButton("계산하기");
		this.add(calcBtn);
		calcBtn.setFont(calcBtn.getFont().deriveFont(15.0f));
		calcBtn.setLocation(140, 120);
		calcBtn.setSize(100, 25);

		this.add(sum);
		sum.setLocation(20, 180);
		sum.setSize(50, 30);

		this.add(total);
		total.setLocation(65, 180);
		total.setSize(100, 30);

		this.add(avg);
		avg.setLocation(200, 180);
		avg.setSize(50, 30);

		this.add(average);
		average.setLocation(245, 180);
		average.setSize(100, 30);
		
		calcBtn.addActionListener(event -> {
			//new ScoreFrame$ActionHandler().actionPerformed(event);
			result();
		});
	}
	
	public void result() {
		int sum2 = Integer.parseInt(javaScore.getText()) + Integer.parseInt(sqlScore.getText());
		double avg2 = sum2 / 2.0;
		
		total.setText(Integer.toString(sum2));
		average.setText(Double.toString(avg2));
	}
}
