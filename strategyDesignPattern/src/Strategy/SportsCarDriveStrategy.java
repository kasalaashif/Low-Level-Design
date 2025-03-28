package Strategy;

public class SportsCarDriveStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Sports Car Engine Required");
	}

}
