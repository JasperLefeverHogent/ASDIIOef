package domein;

import domein.ingredients.Cheese;
import domein.ingredients.Clams;
import domein.ingredients.Dough;
import domein.ingredients.Pepperoni;
import domein.ingredients.Sauce;
import domein.ingredients.cheese.ReggianoCheese;
import domein.ingredients.clams.FreshClams;
import domein.ingredients.dough.ThinCrustDough;
import domein.ingredients.pepperoni.SlicedPepperoni;
import domein.ingredients.sauce.MarinaraSauce;
import domein.ingredients.veggies.Garlic;
import domein.ingredients.veggies.Mushroom;
import domein.ingredients.veggies.Onion;
import domein.ingredients.veggies.RedPepper;
import domein.ingredients.Veggies;

public class BinfPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(),
            new RedPepper()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }

}
