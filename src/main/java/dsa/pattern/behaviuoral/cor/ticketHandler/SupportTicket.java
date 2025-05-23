package dsa.pattern.behaviuoral.cor.ticketHandler;

public class SupportTicket {
    private String type;
    private String description;

    public SupportTicket(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
