package testen;

import domein.CheesePizza;
import domein.ClamPizza;
import domein.PepperoniPizza;
import domein.Pizza;
import domein.PizzaStore;
import domein.SimplePizzaFactory;
import domein.VeggiePizza;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PizzaStoreTest {

    private PizzaStore pizzaStore;

    @BeforeEach
    public void before() {
        pizzaStore = new PizzaStore(new SimplePizzaFactory());
    }

    @Test
    public void clamPizza() {
        Pizza pizza = pizzaStore.orderPizza("Clam");
        Assertions.assertTrue(pizza instanceof ClamPizza);
    }

    @Test
    public void cheesePizza() {
        Pizza pizza = pizzaStore.orderPizza("CHEESE");
        Assertions.assertTrue(pizza instanceof CheesePizza);
    }

    @Test
    public void pepperoniPizza() {
        Pizza pizza = pizzaStore.orderPizza("pepperoni");
        Assertions.assertTrue(pizza instanceof PepperoniPizza);
    }

    @Test
    public void veggiePizza() {
        Pizza pizza = pizzaStore.orderPizza("vEgGiE");
        Assertions.assertTrue(pizza instanceof VeggiePizza);
    }

    @Test
    public void bestaatNietPizza() {
        Pizza pizza = pizzaStore.orderPizza("bestaatNIET");
        Assertions.assertNull(pizza);
    }
}
