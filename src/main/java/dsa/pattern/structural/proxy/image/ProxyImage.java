package dsa.pattern.structural.proxy.image;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String filePath;

    public ProxyImage(String filePath) {
        this.filePath = filePath;
    }
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filePath);
        }
        realImage.display();
    }
}
