package dsa.pattern.exercise.demo3;

public class DesktopPlayer extends Player {

    public DesktopPlayer(VideoFormat videoFormat) {
        super(videoFormat);
    }

    @Override
    void play(String fileName) {
        System.out.println("Desktop is playing: "+videoFormat.getFormat()+", "+fileName);
    }

    @Override
    void stop() {
        System.out.println("Desktop is stopped: "+videoFormat.getFormat());
    }
}
