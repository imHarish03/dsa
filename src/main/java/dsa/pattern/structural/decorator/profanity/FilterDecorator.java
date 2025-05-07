package dsa.pattern.structural.decorator.profanity;

public abstract class FilterDecorator implements Notifier{
    protected Notifier notifier;

    FilterDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    abstract String filterData(String message);

    public String sendMessage(String message) {
        try{
            String filtered = filterData(message);
            return notifier.sendMessage(filtered); //
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
