package dsa.pattern.behaviuoral.cor.ticketHandler;

public class GeneralSupport extends SupportHandler {
    @Override
    public void handleTicket(SupportTicket ticket) {
        if ("general".equalsIgnoreCase(ticket.getType())) {
            System.out.println("GeneralSupport handled: " + ticket.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleTicket(ticket);
        } else {
            System.out.println("No handler found for: " + ticket.getDescription());
        }
    }
}
