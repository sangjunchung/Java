package ncs.test9;

public abstract class Plane {
	private String planeName;
	private int fuelSize;

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public Plane() {

	}

	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	public void refuel(int fuel) {
		this.fuelSize += fuel;
	}

	public abstract void flight(int distance);

	public void info() {
		System.out.println(planeName + " " + fuelSize);
	}
}
