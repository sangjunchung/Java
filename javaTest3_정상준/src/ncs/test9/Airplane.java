package ncs.test9;

public class Airplane extends Plane {

	public Airplane() {

	}

	public Airplane(String inPlaneName, int inFuelSize) {
		super(inPlaneName, inFuelSize);
	}

	@Override
	public void flight(int distance) {
		super.setFuelSize(getFuelSize() - ((distance / 10) * 30));
	}
}
