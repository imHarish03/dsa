package dsa.pattern.behaviuoral.stratergy.documentConverter;

public class HtmlConverter implements DocumentConverter {
    public void convert(String fileName) {
        System.out.println("Converting " + fileName + " to HTML format.");
    }
}