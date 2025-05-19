package dsa.pattern.structural.adapter.invoice;

public class LegacyPrinterAdapter implements InvoiceGenerator{
    private final LegacyPrinter legacyPrinter;

    public LegacyPrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public String generatePDF(InvoiceData invoiceData) {
        return this.legacyPrinter.printInvoice(invoiceData);
    }
}
