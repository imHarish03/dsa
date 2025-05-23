package dsa.pattern.structural.decorator.pizza.decorator;

import dsa.pattern.structural.decorator.pizza.Pizza;

public class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza) {
        super(pizza);
        System.out.println("Adding cheese");
    }


    @Override
    public String getDescription() {
        System.out.println("Mixing cheese");
        return this.pizza.getDescription() + ", cheese";
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 20;
    }
}
