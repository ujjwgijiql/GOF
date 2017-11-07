package zhang.springframework.gof.abstractFactory;

import zhang.springframework.gof.abstractFactory.topping.Cheese;
import zhang.springframework.gof.abstractFactory.topping.MozzarellaCheese;
import zhang.springframework.gof.abstractFactory.topping.Sauce;
import zhang.springframework.gof.abstractFactory.topping.TomatoSauce;

public class SicilianToppingFactory extends BaseToppingFactory{
    @Override
    public  Cheese createCheese(){return new MozzarellaCheese();}
    @Override
    public  Sauce createSauce(){return new TomatoSauce();}
}
