package Vehicle;

import Strategy.PassengerVehicleDriveStrategy;

public class PassengeVehicle extends Vehicle{

	public PassengeVehicle() {
		super(new PassengerVehicleDriveStrategy());
	}

}
