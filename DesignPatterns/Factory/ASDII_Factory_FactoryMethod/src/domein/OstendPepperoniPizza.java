package domein;

public class OstendPepperoniPizza extends Pizza {

    public OstendPepperoniPizza() {
        setName("Ostend Style Pepperoni Pizza");
        setDough("Extra Thick Crust Dough");
        setSauce("Plum Tomato Sauce");

        addTopping("Shredded Mozzarella Cheese");
        addTopping("Black Olives");
        addTopping("Spinach");
        addTopping("Eggplant");
        addTopping("Sliced Pepperoni");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
