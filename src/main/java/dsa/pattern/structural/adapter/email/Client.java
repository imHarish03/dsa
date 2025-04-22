package dsa.pattern.structural.adapter.email;

public class Client {
    public static void main(String[] args) {
        NotificationService.notify("sendgrid","Error", "Something went wrong");
    }
}
