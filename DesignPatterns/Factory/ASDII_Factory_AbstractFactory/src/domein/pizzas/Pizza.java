package domein.pizzas;

import domein.PizzaIngredientFactory;
import domein.ingredients.Cheese;
import domein.ingredients.Sauce;
import domein.ingredients.Dough;
import domein.ingredients.Clams;
import domein.ingredients.Veggies;
import domein.ingredients.Pepperoni;

public abstract class Pizza {

    private String name;
    private Dough dough;
    private Sauce sauce;
    private Veggies veggies[];
    private Cheese cheese;
    private Pepperoni pepperoni;
    private Clams clam;
    private PizzaIngredientFactory ingredientFactory;
    public Pizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clam != null) {
            result.append(clam);
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni);
            result.append("\n");
        }
        return result.toString();
    }

    protected Cheese getCheese() {
        return cheese;
    }

    protected void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    protected Clams getClam() {
        return clam;
    }

    protected void setClam(Clams clam) {
        this.clam = clam;
    }

    protected Dough getDough() {
        return dough;
    }

    protected void setDough(Dough dough) {
        this.dough = dough;
    }

    protected Pepperoni getPepperoni() {
        return pepperoni;
    }

    protected void setPepperoni(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    protected Sauce getSauce() {
        return sauce;
    }

    protected void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    protected Veggies[] getVeggies() {
        return veggies;
    }

    protected void setVeggies(Veggies[] veggies) {
        this.veggies = veggies;
    }

    protected PizzaIngredientFactory getPizzaIngredientFactory() {
        return this.ingredientFactory;
    }
}
