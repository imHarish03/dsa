package dsa.pattern.creational.factory.theme;

public class DarkTheme implements Theme{
    @Override
    public Button createButton() {
        return new DarkButton();
    }
}
