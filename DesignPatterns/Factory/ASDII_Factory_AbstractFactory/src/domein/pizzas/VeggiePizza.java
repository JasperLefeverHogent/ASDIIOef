package domein.pizzas;

import domein.PizzaIngredientFactory;
public class VeggiePizza extends Pizza {

	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		super(ingredientFactory);
	}

	public void prepare() {
		System.out.println("Preparing " + getName());
		setDough(getPizzaIngredientFactory().createDough());
		setSauce(getPizzaIngredientFactory().createSauce());
		setCheese(getPizzaIngredientFactory().createCheese());
		setVeggies(getPizzaIngredientFactory().createVeggies());
	}
}