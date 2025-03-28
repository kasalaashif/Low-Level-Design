package Vehicle;

import Strategy.SpecialCarDriveStrategy;

public class SpecialCar extends Vehicle {

	public SpecialCar() {
		super(new SpecialCarDriveStrategy());
	}
}
