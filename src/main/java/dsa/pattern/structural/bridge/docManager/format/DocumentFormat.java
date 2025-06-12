package dsa.pattern.structural.bridge.docManager.format;

import dsa.pattern.structural.bridge.docManager.doc.Document;

public abstract class DocumentFormat {
    protected Document document;

    public DocumentFormat(Document document) {
        this.document = document;
    }

    public abstract void export();
}
