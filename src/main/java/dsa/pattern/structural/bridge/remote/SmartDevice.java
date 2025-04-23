package dsa.pattern.structural.bridge.remote;

public interface SmartDevice extends Device {
    void setChannel(int number);
    void mute();
}