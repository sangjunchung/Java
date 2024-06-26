package sup3.sample;

public class Calculator {
	private int num1;
	private int num2;

	public Calculator(int a, int b) {
		this.num1 = a;
		this.num2 = b;
	}

	public void displayResult() {
		System.out.println(num1 + " + " + num2 + " = " + sum(num1, num2));
		System.out.println(num1 + " - " + num2 + " = " + sub(num1, num2));
		System.out.println(num1 + " * " + num2 + " = " + mul(num1, num2));
		System.out.println(num1 + " / " + num2 + " = " + div(num1, num2));
		System.out.println(num1 + " % " + num2 + " = " + rem(num1, num2));
	}

	public int sum(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

	public int rem(int a, int b) {
		return a % b;
	}
}
