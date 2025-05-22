package dsa.pattern.behaviuoral.stratergy.documentConverter;

public class PdfConverter implements DocumentConverter {
    public void convert(String fileName) {
        System.out.println("Converting " + fileName + " to PDF format.");
    }
}