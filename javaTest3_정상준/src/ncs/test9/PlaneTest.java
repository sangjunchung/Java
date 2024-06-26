package ncs.test9;

public class PlaneTest {

	public static void main(String[] args) {
		Plane air = new Airplane("L747", 1000);
		Plane cargo = new Cargoplane("C40", 1000);
		
		System.out.println("Plane fuelSize");
		System.out.println("-----------------");
		air.info();
		cargo.info();
		
		System.out.println();
		System.out.println("100 운항");
		air.flight(100);
		cargo.flight(100);
		System.out.println();	
		
		System.out.println("Plane fuelSize");
		System.out.println("-----------------");
		air.info();
		cargo.info();
		
		System.out.println();
		System.out.println("200 주유");
		air.refuel(200);
		cargo.refuel(200);
		System.out.println();	
		
		System.out.println("Plane fuelSize");
		System.out.println("-----------------");
		air.info();
		cargo.info();
	}

}
