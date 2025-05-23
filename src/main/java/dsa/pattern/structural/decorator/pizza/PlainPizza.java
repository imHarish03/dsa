package dsa.pattern.structural.decorator.pizza;

public class PlainPizza implements  Pizza{

    public PlainPizza() {
        System.out.println("Creating plain pizza");
    }

    @Override
    public String getDescription() {
        return "Simple plain pizza";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
