package dsa.pattern.behaviuoral.stratergy.documentConverter;

public class DocxConverter implements DocumentConverter {
    public void convert(String fileName) {
        System.out.println("Converting " + fileName + " to DOCX format.");
    }
}