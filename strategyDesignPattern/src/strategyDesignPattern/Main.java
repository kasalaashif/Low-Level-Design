package strategyDesignPattern;

import Vehicle.PassengeVehicle;
import Vehicle.SpecialCar;
import Vehicle.SportsCar;
import Vehicle.Vehicle;

public class Main {

	public static void main(String[] args) {
		Vehicle sportsCar = new SportsCar();
		Vehicle specialCar = new SpecialCar();
		Vehicle passengerVehicle = new PassengeVehicle();
		sportsCar.drive();
		specialCar.drive();
		passengerVehicle.drive();
		
	}

}
