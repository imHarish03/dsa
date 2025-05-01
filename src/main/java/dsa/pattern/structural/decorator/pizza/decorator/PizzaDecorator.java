package dsa.pattern.structural.decorator.pizza.decorator;

import dsa.pattern.structural.decorator.pizza.Pizza;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
