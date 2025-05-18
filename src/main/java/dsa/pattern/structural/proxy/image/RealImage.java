package dsa.pattern.structural.proxy.image;

public class RealImage implements Image{
    private final String filePath;

    public RealImage(String filePath){
        this.filePath=filePath;
        loadImageFromDisk(this.filePath);
    }

    private void loadImageFromDisk(String filePath) {
        System.out.println("Loading image from disk: " + filePath);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filePath);
    }
}
