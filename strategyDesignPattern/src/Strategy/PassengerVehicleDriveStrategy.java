package Strategy;

public class PassengerVehicleDriveStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Normal Car Engine Required");
	}

}
