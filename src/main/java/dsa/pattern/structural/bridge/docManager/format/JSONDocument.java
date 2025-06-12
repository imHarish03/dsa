package dsa.pattern.structural.bridge.docManager.format;

import dsa.pattern.structural.bridge.docManager.doc.Document;

public class JSONDocument extends DocumentFormat {
    public JSONDocument(Document document) {
        super(document);
    }

    @Override
    public void export() {
        System.out.println("{ \"title\": \"" + document.getTitle() + "\", \"content\": \"" + document.getContent() + "\" }");
    }
}
