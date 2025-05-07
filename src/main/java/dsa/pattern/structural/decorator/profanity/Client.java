package dsa.pattern.structural.decorator.profanity;

public class Client {
    public static void main(String[] args) {
        Notifier notifier = new ProfanityFilterDecorator(new BasicNotifier());
        System.out.println(notifier.sendMessage("You dumb badword!"));


    }
}
