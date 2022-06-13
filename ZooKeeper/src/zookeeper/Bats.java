package zookeeper;

public class Bats extends Mammal{
	
	public Bats() {
		energyLevel =300;
	}
	
	void fly() {
		
		System.out.println("Flying sound");
		energyLevel-=50;
	}
		
	void eathumans() {
		System.out.println("Eating ");
		energyLevel+=25;

	}
	
	void attackTown() {
		System.out.println("Sounds of burning");
		energyLevel-=100;

	}
}
