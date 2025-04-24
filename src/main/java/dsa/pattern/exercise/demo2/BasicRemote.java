package dsa.pattern.exercise.demo2;

public class BasicRemote extends RemoteControl {
    private boolean powerOn = false;
    private int volume = 50;

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        if(powerOn) {
            device.turnOff();
        }else{
            device.turnOn();
        }
        powerOn = !powerOn;
    }

    @Override
    public void volumeUp() {
        volume+=10;
        device.setVolume(volume);

    }

    @Override
    public void volumeDown() {
        volume-=10;
        device.setVolume(volume);
    }
}
