package decoratorPattern;

public class PizzaDecorator implements BasePizza{
	
	public BasePizza basePizza;
	
	public PizzaDecorator(BasePizza basePizza){
		this.basePizza = basePizza;
	}

	@Override
	public String getDescription() {
		return basePizza.getDescription();
	}

	@Override
	public int getPrice() {
		return basePizza.getPrice();
	}

}
