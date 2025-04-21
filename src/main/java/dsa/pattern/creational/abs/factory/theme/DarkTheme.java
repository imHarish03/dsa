package dsa.pattern.creational.abs.factory.theme;

public class DarkTheme implements Theme{
    @Override
    public Button createButton() {
        return new DarkButton();
    }
}
