package dsa.pattern.structural.bridge.remote;

import dsa.pattern.structural.bridge.remote.abstraction.RemoteControl;
import dsa.pattern.structural.bridge.remote.abstraction.SmartDevice;

public class SmartRemote extends RemoteControl {
    private int currentChannel = 1;
    private int volume = 50;
    private boolean power = false;

    private SmartDevice smartDevice;

    public SmartRemote(SmartDevice  device) {
        super(device);
        System.out.println("Smart remote created");
        this.smartDevice = device;
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

    public void mute() {
        smartDevice.mute();
    }

    public void setChannel(int ch) {
        smartDevice.setChannel(ch);
    }

    public void saveFavoriteChannel(int channel) {
        System.out.println("Favorite channel saved: " + channel);
    }
}
