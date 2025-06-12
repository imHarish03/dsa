package dsa.pattern.structural.bridge.docManager;

import dsa.pattern.structural.bridge.docManager.doc.Document;
import dsa.pattern.structural.bridge.docManager.doc.PDFDocument;
import dsa.pattern.structural.bridge.docManager.format.DocumentFormat;
import dsa.pattern.structural.bridge.docManager.format.JSONDocument;

public class Client {
    public static void main(String[] args) {
        Document pdf = new PDFDocument();
        DocumentFormat json = new JSONDocument(pdf);
        json.export();  // Exports PDF in JSON format
    }
}
