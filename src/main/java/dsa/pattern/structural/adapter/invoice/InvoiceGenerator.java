package dsa.pattern.structural.adapter.invoice;

public interface InvoiceGenerator {
    String generatePDF(InvoiceData invoiceData);
}
