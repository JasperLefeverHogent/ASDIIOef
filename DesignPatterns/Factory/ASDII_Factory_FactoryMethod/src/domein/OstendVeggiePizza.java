package domein;

public class OstendVeggiePizza extends Pizza {

    public OstendVeggiePizza() {
        setName("Ostend Deep Dish Veggie Pizza");
        setDough("Extra Thick Crust Dough");
        setSauce("Plum Tomato Sauce");

        addTopping("Shredded Mozzarella Cheese");
        addTopping("Black Olives");
        addTopping("Spinach");
        addTopping("Eggplant");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
