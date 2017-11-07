package zhang.springframework.gof.decorator.decorators;


import zhang.springframework.gof.decorator.components.FlowerBouquet;

public abstract class FlowerBouquetDecorator extends FlowerBouquet {
    public abstract String getDescription();
}
