package dsa.pattern.structural.proxy.document;

public class DocumentProxy implements Document {
    private RealDocument realDocument;
    private String password;

    public DocumentProxy(String password) {
        this.password = password;
    }

    @Override
    public void display() {
        if ("secret".equals(password)) {
            if (realDocument == null) {
                realDocument = new RealDocument("Sensitive Company Data");
            }
            realDocument.display();
        } else {
            System.out.println("Access Denied: Incorrect Password");
        }
    }
}
