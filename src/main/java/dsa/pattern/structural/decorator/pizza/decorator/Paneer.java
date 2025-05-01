package dsa.pattern.structural.decorator.pizza.decorator;

import dsa.pattern.structural.decorator.pizza.Pizza;

public class Paneer extends PizzaDecorator {
    public Paneer(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + ", paneer";
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 20;
    }
}
