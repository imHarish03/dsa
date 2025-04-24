package dsa.pattern.exercise.demo2;

public class Client {
    public static void main(String[] args) {
        Device device = new Tv();
        RemoteControl remoteControl = new BasicRemote(device);
        remoteControl.togglePower();
        remoteControl.volumeUp();
        remoteControl.volumeDown();
    }
}
