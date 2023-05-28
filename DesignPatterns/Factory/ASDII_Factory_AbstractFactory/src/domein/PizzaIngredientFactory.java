package domein;

import domein.ingredients.Veggies;
import domein.ingredients.Pepperoni;
import domein.ingredients.Clams;
import domein.ingredients.Cheese;
import domein.ingredients.Sauce;
import domein.ingredients.Dough;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

}
