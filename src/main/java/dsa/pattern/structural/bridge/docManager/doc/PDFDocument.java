package dsa.pattern.structural.bridge.docManager.doc;

public class PDFDocument implements Document{
    @Override
    public String getContent() {
        return "Get PDF content";
    }

    @Override
    public String getTitle() {
        return "Get PDF title";
    }
}
