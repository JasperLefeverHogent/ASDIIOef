package domein.pizzas;

import domein.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		super(ingredientFactory);
	}

        @Override
	public void prepare() {
		System.out.println("Preparing " + getName());
		setDough(getPizzaIngredientFactory().createDough());
		setSauce(getPizzaIngredientFactory().createSauce());
		setCheese(getPizzaIngredientFactory().createCheese());
	}

}