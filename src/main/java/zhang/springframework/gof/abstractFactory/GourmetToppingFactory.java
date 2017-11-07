package zhang.springframework.gof.abstractFactory;

import zhang.springframework.gof.abstractFactory.topping.CaliforniaOilSauce;
import zhang.springframework.gof.abstractFactory.topping.Cheese;
import zhang.springframework.gof.abstractFactory.topping.GoatCheese;
import zhang.springframework.gof.abstractFactory.topping.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory{
    @Override
    public Cheese createCheese(){return new GoatCheese();}
    @Override
    public Sauce createSauce(){return new CaliforniaOilSauce();}
}
