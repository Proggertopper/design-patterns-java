package behavioral.visitor;

public class TestClient {
    public static void main(String[] args) {
        Element[] devices = new Element[]{new Computer() , new Server()};

        PowerReportVisitor visitor = new PowerReportVisitor();

        for (Element device : devices) {
            device.accept(visitor);
        }
    }
}
