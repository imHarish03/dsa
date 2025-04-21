package dsa.pattern.creational.factory.theme;

public class Client {
    public static void main(String[] args) {
        Theme theme = ThemeFactory.getTheme("Ligh");
        Button button = theme.createButton();
        button.render();
    }
}
