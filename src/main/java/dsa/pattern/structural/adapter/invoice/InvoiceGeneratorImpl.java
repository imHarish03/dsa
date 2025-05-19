package dsa.pattern.structural.adapter.invoice;

public class InvoiceGeneratorImpl implements InvoiceGenerator {
    @Override
    public String generatePDF(InvoiceData invoiceData) {
        return "Invoice generated with data: " + invoiceData.getInvoiceNo() + ", " + invoiceData.getCustomerName() + ", " + invoiceData.getCustomerAddress() + ", " + invoiceData.getCustomerEmail() + ", " + invoiceData.getInvoiceDate();
    }
}
