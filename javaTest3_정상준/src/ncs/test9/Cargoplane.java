package ncs.test9;

public class Cargoplane extends Plane {

	public Cargoplane() {

	}

	public Cargoplane(String inPlaneName, int inFuelSize) {
		super(inPlaneName, inFuelSize);
	}

	@Override
	public void flight(int distance) {
		super.setFuelSize(getFuelSize() - ((distance / 10) * 50));
	}
}
