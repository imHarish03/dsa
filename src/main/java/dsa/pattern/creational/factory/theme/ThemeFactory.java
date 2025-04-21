package dsa.pattern.creational.factory.theme;

public class ThemeFactory {

    public static Theme getTheme(String theme) {
        if (theme.equals("Light")) {
            return new LightTheme();
        } else if (theme.equals("Dark")) {
            return new DarkTheme();
        }else{
            throw new RuntimeException("Invalid Theme");
        }
    }
}
