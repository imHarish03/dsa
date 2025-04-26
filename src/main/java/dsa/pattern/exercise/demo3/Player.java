package dsa.pattern.exercise.demo3;

public abstract class Player {
    protected VideoFormat videoFormat;

    public Player(VideoFormat videoFormat) {
        this.videoFormat = videoFormat;
    }

    abstract void play(String fileName);
    abstract void stop();

}
