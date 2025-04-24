package dsa.pattern.structural.bridge.remote.abstraction.devicetype;

public interface SmartDevice extends Device {
    void setChannel(int number);
    void mute();
}