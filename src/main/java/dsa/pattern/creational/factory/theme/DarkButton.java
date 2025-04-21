package dsa.pattern.creational.factory.theme;

public class DarkButton implements  Button{
    @Override
    public void render() {
        System.out.println("Dark Button");
    }
}
