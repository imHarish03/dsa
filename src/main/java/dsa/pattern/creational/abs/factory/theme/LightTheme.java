package dsa.pattern.creational.abs.factory.theme;

public class LightTheme implements Theme{
    @Override
    public Button createButton() {
        return new LightButton();
    }
}
