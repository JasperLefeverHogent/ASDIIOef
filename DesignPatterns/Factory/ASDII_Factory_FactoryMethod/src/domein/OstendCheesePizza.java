package domein;

public class OstendCheesePizza extends Pizza {

    public OstendCheesePizza() {
        setName("Ostend Style Deep Dish Cheese Pizza");
        setDough("Extra Thick Crust Dough");
        setSauce("Plum Tomato Sauce");

        addTopping("Shredded Mozzarella Cheese");
    }

    @Override public
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
