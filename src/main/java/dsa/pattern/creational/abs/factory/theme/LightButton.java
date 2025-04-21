package dsa.pattern.creational.abs.factory.theme;

public class LightButton implements  Button{
    @Override
    public void render() {
        System.out.println("Light Button");
    }
}
