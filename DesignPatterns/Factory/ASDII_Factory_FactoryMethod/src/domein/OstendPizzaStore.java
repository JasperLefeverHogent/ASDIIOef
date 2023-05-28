package domein;

public class OstendPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return switch (type.toLowerCase()) {
		case "cheese" -> new OstendCheesePizza();
		case "pepperoni" -> new OstendPepperoniPizza();
		case "clam" -> new OstendClamPizza();
		case "veggie" -> new OstendVeggiePizza();
		default -> null;
		};
    }
}
