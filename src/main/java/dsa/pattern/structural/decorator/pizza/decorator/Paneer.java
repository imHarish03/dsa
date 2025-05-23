package dsa.pattern.structural.decorator.pizza.decorator;

import dsa.pattern.structural.decorator.pizza.Pizza;

public class Paneer extends PizzaDecorator {
    public Paneer(Pizza pizza) {
        super(pizza);
        System.out.println("Adding paneer");
    }

    @Override
    public String getDescription() {
        System.out.println("Mixing paneer");
        return this.pizza.getDescription() + ", paneer";
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 20;
    }
}
