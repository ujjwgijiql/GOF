package zhang.springframework.gof.abstractFactory;

import zhang.springframework.gof.abstractFactory.BasePizzaFactory;
import zhang.springframework.gof.abstractFactory.SicilianPizzaFactory;
import zhang.springframework.gof.abstractFactory.product.Pizza;

import org.junit.Test;

public class SicilianPizzaFactoryTest {

    @Test
    public void testCreatePizza() throws Exception {
        BasePizzaFactory pizzaFactory=new SicilianPizzaFactory();
        Pizza cheesePizza=pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza =pizzaFactory.createPizza("pepperoni");
    }
}