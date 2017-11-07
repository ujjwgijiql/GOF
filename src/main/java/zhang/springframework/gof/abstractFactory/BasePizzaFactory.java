package zhang.springframework.gof.abstractFactory;


import zhang.springframework.gof.abstractFactory.product.Pizza;

public abstract class BasePizzaFactory {
    
    public abstract Pizza createPizza(String type);
}
