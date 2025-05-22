package dsa.pattern.behaviuoral.stratergy.documentConverter;

public class Client {
    public static void main(String[] args) {
        ConverterContext converterContext = new ConverterContext();
        converterContext.getConverter("pdf", "document.pdf");
        converterContext.getConverter("docx", "document.docx");
        converterContext.getConverter("html", "document.html");
    }

}
