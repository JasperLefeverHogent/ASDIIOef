package domein;

import domein.pizzas.CheesePizza;
import domein.pizzas.ClamPizza;
import domein.pizzas.PepperoniPizza;
import domein.pizzas.Pizza;

public class OstendPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new OstendPizzaIngredientFactory();

		switch (item.toLowerCase()) {
		case "cheese" -> {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Ostend Style Cheese Pizza");
		}
		case "veggie" -> {
			pizza = new domein.pizzas.VeggiePizza(ingredientFactory);
			pizza.setName("Ostend Style Veggie Pizza");
		}
		case "clam" -> {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Ostend Style Clam Pizza");
		}
		case "pepperoni" -> {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Ostend Style Pepperoni Pizza");
		}
		}
		return pizza;
	}
}
