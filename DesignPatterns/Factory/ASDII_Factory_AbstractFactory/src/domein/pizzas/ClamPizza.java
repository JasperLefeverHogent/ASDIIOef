package domein.pizzas;

import domein.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    public void prepare() {
        System.out.println("Preparing " + getName());
        setDough(getPizzaIngredientFactory().createDough());
        setSauce(getPizzaIngredientFactory().createSauce());
        setCheese(getPizzaIngredientFactory().createCheese());
        setClam(getPizzaIngredientFactory().createClam());
    }

}
