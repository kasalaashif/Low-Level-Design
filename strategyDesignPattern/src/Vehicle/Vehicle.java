package Vehicle;

import Strategy.DriveStrategy;

public class Vehicle {
	public DriveStrategy driveStrategy; 
	public Vehicle(DriveStrategy driveStrategy) {
		this.driveStrategy = driveStrategy;
	}
	
	public void drive() {
		driveStrategy.drive();
	}
}
