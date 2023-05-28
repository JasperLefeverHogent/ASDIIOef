package domein;

public class BinfPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		
		return switch (type.toLowerCase()) {
		
		case "cheese" -> new BinfCheesePizza();
		
		case "pepperoni" -> new BinfPepperoniPizza();
		
		case "clam" -> new BinfClamPizza();
		
		case "veggie" -> new BinfVeggiePizza();
		
		default -> null;
		};
	}

}

