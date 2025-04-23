package dsa.pattern.structural.bridge.remote;

import dsa.pattern.structural.bridge.remote.abstraction.Device;

public class Radio implements Device {
    @Override
    public void turnOn() {
        System.out.println("Radio is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is OFF");
    }

    @Override
    public void setVolume(int percent) {
        System.out.println("Radio volume set to " + percent + "%");
    }
}
