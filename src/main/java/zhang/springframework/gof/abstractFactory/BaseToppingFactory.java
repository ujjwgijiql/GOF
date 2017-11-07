package zhang.springframework.gof.abstractFactory;

import zhang.springframework.gof.abstractFactory.topping.Cheese;
import zhang.springframework.gof.abstractFactory.topping.Sauce;

public abstract class BaseToppingFactory {
    public abstract Cheese createCheese();
    public abstract Sauce createSauce();
}
