package dsa.pattern.exercise.demo2;

public class Tv implements Device {

    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
    }

    @Override
    public void setVolume(int percent) {
        System.out.println("TV volume set to " + percent + "%");
    }
}
