package dsa.pattern.creational.factory.theme;

public class LightButton implements  Button{
    @Override
    public void render() {
        System.out.println("Light Button");
    }
}
