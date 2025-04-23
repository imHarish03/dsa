package dsa.pattern.structural.bridge.remote.abstraction;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        System.out.println("Remote control created");
        this.device = device;
    }

    public abstract void togglePower();
    public abstract void volumeUp();
    public abstract void volumeDown();
}
