package dsa.pattern.creational.abs.factory.theme;

public class DarkButton implements  Button{
    @Override
    public void render() {
        System.out.println("Dark Button");
    }
}
