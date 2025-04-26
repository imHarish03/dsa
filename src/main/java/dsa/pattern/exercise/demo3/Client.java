package dsa.pattern.exercise.demo3;

public class Client {
    public static void main(String[] args) {
        Player desktopPlayer = new DesktopPlayer(new MP4Decoder());
        desktopPlayer.play("movie.mp4");
        desktopPlayer.stop();

        System.out.println("---");


    }
}
