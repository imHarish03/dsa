package dsa.pattern.behaviuoral.cor.ticketHandler;

public class TechnicalSupport extends SupportHandler {
    @Override
    public void handleTicket(SupportTicket ticket) {
        if ("technical".equalsIgnoreCase(ticket.getType())) {
            System.out.println("TechnicalSupport handled: " + ticket.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleTicket(ticket);
        } else {
            System.out.println("No handler found for: " + ticket.getDescription());
        }
    }
}
