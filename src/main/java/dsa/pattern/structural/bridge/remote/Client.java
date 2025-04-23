package dsa.pattern.structural.bridge.remote;

public class Client {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remote = new BasicRemote(tv);

        remote.togglePower();
        remote.volumeUp();
        remote.volumeDown();

        System.out.println("--------");

        Device radio = new Radio();
        RemoteControl radioRemote = new BasicRemote(radio);
        radioRemote.togglePower();
        radioRemote.volumeUp();

        /// ////////////////////////////////////
        SmartDevice smartTv = new TVDevice();
        SmartRemote smartRemote = new SmartRemote(smartTv);

        System.out.println("--------");
        smartRemote.togglePower();     // ON
        smartRemote.volumeUp();        // 60
        smartRemote.setChannel(45);    // Channel 45
        smartRemote.mute();            // Mute
        smartRemote.saveFavoriteChannel(45);

    }
}
