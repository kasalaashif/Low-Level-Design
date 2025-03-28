package decoratorPattern;

public class VegetablePizza implements BasePizza{

	@Override
	public String getDescription() {
		return "VegetablePizza";
	}

	@Override
	public int getPrice() {
		return 10;
	}

}
