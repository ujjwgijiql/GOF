package zhang.springframework.gof.abstractFactory;

import zhang.springframework.gof.abstractFactory.BasePizzaFactory;
import zhang.springframework.gof.abstractFactory.GourmetPizzaFactory;
import zhang.springframework.gof.abstractFactory.product.Pizza;

import org.junit.Test;

public class GourmetPizzaFactoryTest {

    @Test
    public void testCreatePizza() throws Exception {
    BasePizzaFactory pizzaFactory=new GourmetPizzaFactory();
        Pizza cheesePizza= pizzaFactory.createPizza("cheese");
        Pizza veggiePizza=pizzaFactory.createPizza("veggie");
    }
}