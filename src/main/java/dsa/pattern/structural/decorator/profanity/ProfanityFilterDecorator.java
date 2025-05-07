package dsa.pattern.structural.decorator.profanity;

public class ProfanityFilterDecorator extends FilterDecorator{

    public ProfanityFilterDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    String filterData(String message) {
        try {
            return message.replace("badword", "****");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
