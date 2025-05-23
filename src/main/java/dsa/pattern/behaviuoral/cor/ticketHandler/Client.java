package dsa.pattern.behaviuoral.cor.ticketHandler;

public class Client {

    public static void main(String[] args) {
        SupportHandler general = new GeneralSupport();
        SupportHandler technical = new TechnicalSupport();
        SupportHandler billing = new BillingSupport();

        general.setNextHandler(technical);
        technical.setNextHandler(billing);

        SupportTicket t1 = new SupportTicket("general", "How to reset password?");
        SupportTicket t2 = new SupportTicket("technical", "App crashes on login.");
        SupportTicket t3 = new SupportTicket("billing", "Why was I charged twice?");
        SupportTicket t4 = new SupportTicket("other", "I need help with something else.");

        general.handleTicket(t1);
        general.handleTicket(t2);
        general.handleTicket(t3);
        general.handleTicket(t4);
    }

}
