package domein;

public class OstendClamPizza extends Pizza {

    public OstendClamPizza() {
        setName("Chicago Style Clam Pizza");
        setDough("Extra Thick Crust Dough");
        setSauce("Plum Tomato Sauce");

        addTopping("Shredded Mozzarella Cheese");
        addTopping("Frozen Clams from Chesapeake Bay");
    }

    //@Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
