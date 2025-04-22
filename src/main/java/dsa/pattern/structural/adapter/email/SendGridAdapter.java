package dsa.pattern.structural.adapter.email;

public class SendGridAdapter implements EmailService{
    private SendGridAPI sendGridAPI;

    public SendGridAdapter(SendGridAPI sendGridAPI){
        this.sendGridAPI = sendGridAPI;
    }
    @Override
    public void sendEmail(String to, String subject, String body) {
        sendGridAPI.triggerEmail(to, subject, body);
    }
}
