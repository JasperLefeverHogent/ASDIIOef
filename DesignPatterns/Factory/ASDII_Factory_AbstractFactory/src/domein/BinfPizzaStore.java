package domein;

import domein.pizzas.CheesePizza;
import domein.pizzas.ClamPizza;
import domein.pizzas.PepperoniPizza;
import domein.pizzas.Pizza;
import domein.pizzas.VeggiePizza;

public class BinfPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new BinfPizzaIngredientFactory();

		switch (item.toLowerCase()) {
		case "cheese" -> {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("BINF Style Cheese Pizza");
		}
		case "veggie" -> {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("BINF Style Veggie Pizza");
		}
		case "clam" -> {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("BINF Style Clam Pizza");
		}
		case "pepperoni" -> {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("BINF Style Pepperoni Pizza");
		}
		}
		return pizza;
	}
}
