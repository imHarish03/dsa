package dsa.pattern.structural.bridge.remote;

import dsa.pattern.structural.bridge.remote.abstraction.Device;
import dsa.pattern.structural.bridge.remote.abstraction.RemoteControl;

public class BasicRemote extends RemoteControl {
    private boolean power = false;
    private int volume = 50;



    public BasicRemote(Device device) {
        super(device);
        System.out.println("Basic remote created");
    }

    @Override
    public void togglePower() {
        if (power) {
            device.turnOff();
        } else {
            device.turnOn();
        }
        power = !power;
    }

    @Override
    public void volumeUp() {
        volume += 10;
        device.setVolume(volume);
    }

    @Override
    public void volumeDown() {
        volume -= 10;
        device.setVolume(volume);
    }
}
