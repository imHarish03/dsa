package dsa.pattern.structural.adapter.invoice;

public class Client {
    public static void main(String[] args) {
        InvoiceGenerator invoiceGenerator = new InvoiceGeneratorImpl();
        InvoiceData invoiceData = new InvoiceData("01001", "abc", "abc", "abc", "abc");
        String pdf = invoiceGenerator.generatePDF(invoiceData);
        System.out.println("Now using InvoiceGeneratorImpl:"+pdf);


        InvoiceGenerator legacyInvoiceGenerator = new LegacyPrinterAdapter(new LegacyPrinter());
        pdf = legacyInvoiceGenerator.generatePDF(invoiceData);
        System.out.println("Now using LegacyPrinterAdapter:"+pdf);
    }
}
