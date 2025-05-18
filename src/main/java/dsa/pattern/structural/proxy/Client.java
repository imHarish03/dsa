package dsa.pattern.structural.proxy;

public class Client {
    public static void main(String[] args) {
        Document doc1 = new DocumentProxy("admin");
        doc1.display(); // Access denied

        Document doc2 = new DocumentProxy("secret");
        doc2.display(); // Displays the real document
    }
}
