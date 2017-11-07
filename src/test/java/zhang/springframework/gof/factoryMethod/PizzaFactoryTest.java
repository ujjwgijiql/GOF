package zhang.springframework.gof.factoryMethod;

import org.junit.Test;

import zhang.springframework.gof.factoryMethod.BasePizzaFactory;
import zhang.springframework.gof.factoryMethod.Pizza;
import zhang.springframework.gof.factoryMethod.PizzaFactory;

public class PizzaFactoryTest {
    @Test
    public void testMakePizzas(){
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}
