package decoratorPattern;

public class JalapenoToppings extends PizzaDecorator{

	public JalapenoToppings(BasePizza basePizza) {
		super(basePizza);
	}

	@Override
	public String  getDescription() {
		return basePizza.getDescription() + ", Jalapeno Toppings";
	}

	@Override
	public int getPrice() {
		return basePizza.getPrice() + 2;
	} 
}
