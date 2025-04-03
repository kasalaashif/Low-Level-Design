package NULLPointerDesignPattern;

public class VehicleFactory {

	public Vehicle getVehicleObject(String str) {
		if("Car".equals(str))
			return new Car();
		else
			return new NullClass();
	}

}
