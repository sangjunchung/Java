package example2;

import java.util.HashMap;
import java.util.Map;

interface Unit {
	void attack();

	void move();

	void specialAbility();
}

class Archer implements Unit {
	private String name;
	private int attackDamage;
	private int attackRange;

	public Archer(String name, int attackDamage, int attackRange) {
		this.name = name;
		this.attackDamage = attackDamage;
		this.attackRange = attackRange;
	}

	@Override
	public void attack() {
		System.out.println(name + " the Archer attacks with a bow, dealing " + attackDamage + " damage from "
				+ attackRange + " range");
	}

	@Override
	public void move() {
		System.out.println(name + " the Archer moves quickly");
	}

	@Override
	public void specialAbility() {
		System.out.println(name + " the Archer uses 'Piercing Shot'");
	}
}

class Cavalry implements Unit {
	private String name;
	private int movementSpeed;
	private int health;

	public Cavalry(String name, int movementSpeed, int health) {
		this.name = name;
		this.movementSpeed = movementSpeed;
		this.health = health;
	}

	@Override
	public void attack() {
		System.out.println(name + " the Cavalry attacks with a lance");
	}

	@Override
	public void move() {
		System.out.println(name + " the Cavalry moves swiftly at " + movementSpeed);
	}

	@Override
	public void specialAbility() {
		System.out.println(name + " the Cavalry uses 'Charge'");
	}
}

abstract class UnitFactory {
	abstract Unit createUnit(String name);
}

class ArcherFactory extends UnitFactory {

	@Override
	Unit createUnit(String name) {
		int attackDamage = (int) (Math.random() * 10) + 10;
		int attackRange = (int) (Math.random() * 5) + 5;
		return new Archer(name, attackDamage, attackRange);
	}
}

class CavalryFactory extends UnitFactory {

	@Override
	Unit createUnit(String name) {
		int movementSpeed = (int) (Math.random() * 5) + 10;
		int health = (int) (Math.random() * 50) + 50;
		return new Cavalry(name, movementSpeed, health);
	}
}

public class GameUnitDemo {

	public static void main(String[] args) {
		Map<String, UnitFactory> map = new HashMap<>();
		map.put("Archer", new ArcherFactory());
		map.put("Cavalry", new CavalryFactory());
		
		for(int i=0;i<5;i++) {
			String unitType = Math.random() < 0.5 ? "Archer":"Cavalry";
			
			UnitFactory factory = map.get(unitType);
			Unit unit = factory.createUnit(unitType+" "+(i+1));
			unit.attack();
			unit.move();
			unit.specialAbility();
			System.out.println();
		}
	}
}
