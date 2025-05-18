package dsa.pattern.structural.proxy.document;

public class RealDocument implements Document {
    private String content;

    public RealDocument(String content) {
        this.content = content;
    }

    public void display() {
        System.out.println("Displaying document: " + content);
    }
}
