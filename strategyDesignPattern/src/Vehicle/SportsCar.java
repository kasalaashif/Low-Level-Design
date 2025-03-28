package Vehicle;

import Strategy.SportsCarDriveStrategy;

public class SportsCar extends Vehicle {

	public SportsCar() {
		super(new SportsCarDriveStrategy());
	}

}
