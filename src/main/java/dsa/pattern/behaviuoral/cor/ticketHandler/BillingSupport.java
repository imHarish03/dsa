package dsa.pattern.behaviuoral.cor.ticketHandler;

public class BillingSupport extends SupportHandler {
    @Override
    public void handleTicket(SupportTicket ticket) {
        if ("billing".equalsIgnoreCase(ticket.getType())) {
            System.out.println("BillingSupport handled: " + ticket.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleTicket(ticket);
        } else {
            System.out.println("No handler found for: " + ticket.getDescription());
        }
    }
}
