package dsa.pattern.behaviuoral.stratergy.documentConverter;

import java.util.HashMap;
import java.util.Map;

public class ConverterContext {
    private Map<String, DocumentConverter> converters = new HashMap<>();

    public ConverterContext() {
        converters.put("pdf", new PdfConverter());
        converters.put("docx", new DocxConverter());
        converters.put("html", new HtmlConverter());
    }

    public void getConverter(String format, String fileName) {
        converters.get(format).convert(fileName);
    }
}
