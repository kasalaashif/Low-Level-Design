package decoratorPattern;

public class Main {
	
	public static void main(String[] args) {
		BasePizza pizza = new JalapenoToppings(new ExtraCheeseToppings(new MargheritaPizza()));
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getPrice());
	}
}
