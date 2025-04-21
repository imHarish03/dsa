package dsa.pattern.creational.factory.theme;

public class LightTheme implements Theme{
    @Override
    public Button createButton() {
        return new LightButton();
    }
}
