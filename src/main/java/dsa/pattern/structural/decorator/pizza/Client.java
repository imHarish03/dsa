package dsa.pattern.structural.decorator.pizza;

import dsa.pattern.structural.decorator.pizza.decorator.Cheese;
import dsa.pattern.structural.decorator.pizza.decorator.Paneer;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza = new Cheese(pizza);
        pizza = new Paneer(pizza);

        System.out.println(pizza.getDescription() + " $" + pizza.getCost());
    }
}
