package ncs.test10;

public class Secretary extends Employee implements Bouns {

	public Secretary() {

	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public double tax() {
		return super.getSalary() * 0.1;
	}

	@Override
	public void incentive(int pay) {
		super.setSalary(getSalary() + (int) (pay * 0.8));
	}
}
