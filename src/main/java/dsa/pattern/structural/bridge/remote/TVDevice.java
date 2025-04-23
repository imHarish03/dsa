package dsa.pattern.structural.bridge.remote;

import dsa.pattern.structural.bridge.remote.abstraction.SmartDevice;

public class TVDevice implements SmartDevice {
    private int volume;
    private int channel;

    @Override
    public void turnOn() {
        System.out.println("TV turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turned OFF");
    }

    @Override
    public void setVolume(int percent) {
        this.volume = percent;
        System.out.println("TV volume set to " + volume);
    }

    @Override
    public void setChannel(int number) {
        this.channel = number;
        System.out.println("TV channel set to " + channel);
    }

    @Override
    public void mute() {
        this.volume = 0;
        System.out.println("TV muted");
    }
}
