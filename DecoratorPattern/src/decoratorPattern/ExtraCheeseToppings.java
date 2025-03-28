package decoratorPattern;

public class ExtraCheeseToppings extends PizzaDecorator {

	public ExtraCheeseToppings(BasePizza basePizza) {
		super(basePizza);
	}
	
	@Override
	public String  getDescription() {
		return basePizza.getDescription() + ", Extra Cheese";
	}

	@Override
	public int getPrice() {
		return basePizza.getPrice() + 2;
	} 

}
