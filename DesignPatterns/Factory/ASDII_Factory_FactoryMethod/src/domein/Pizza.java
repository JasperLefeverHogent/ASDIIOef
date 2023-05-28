package domein;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Pizza {

    private String name;
    private String dough;
    private String sauce;
    private List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        toppings.forEach(topping -> System.out.printf("   %s", topping));
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(name).append(" ----\n");
        display.append(dough).append("\n");
        display.append(sauce).append("\n");
        for (int i = 0; i < toppings.size(); i++) {
            display.append((String) toppings.get(i) + "\n");
        }
        return display.toString();
    }

    protected String getDough() {
        return dough;
    }

    protected void setDough(String dough) {
        this.dough = dough;
    }

    protected String getSauce() {
        return sauce;
    }

    protected void setSauce(String sauce) {
        this.sauce = sauce;
    }

    protected List<String> getToppings() {
        return Collections.unmodifiableList(toppings);
    }

    protected void addTopping(String topping) {
        toppings.add(topping);
    }

    protected void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
