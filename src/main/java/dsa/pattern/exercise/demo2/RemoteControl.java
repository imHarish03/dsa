package dsa.pattern.exercise.demo2;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        System.out.println("Remote control created");
        this.device = device;
    }

    abstract void togglePower();
    abstract void volumeUp();
    abstract void volumeDown();
}
