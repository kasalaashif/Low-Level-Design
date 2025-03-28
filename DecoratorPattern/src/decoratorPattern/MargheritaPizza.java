package decoratorPattern;

public class MargheritaPizza implements BasePizza {

	@Override
	public String getDescription() {
		return "MargheritaPizza";
	}

	@Override
	public int getPrice() {
		return 5;
	}
}
