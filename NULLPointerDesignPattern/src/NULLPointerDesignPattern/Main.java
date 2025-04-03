package NULLPointerDesignPattern;

public class Main {

	public static void main(String[] args) {
		VehicleFactory v = new VehicleFactory();
		Vehicle bike = v.getVehicleObject("Bike");
		System.out.println(bike.getSeatingCapacity());
		System.out.println(bike.getTankCapacity());
			
		Vehicle car = v.getVehicleObject("Car");
		System.out.println(car.getSeatingCapacity());
		System.out.println(car.getTankCapacity());
	
	}

}
