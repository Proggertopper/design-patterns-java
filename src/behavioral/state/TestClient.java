package behavioral.state;

public class TestClient {
    public static void main(String[] args) {
        Gate gate = new Gate();

        gate.pass();
        gate.insertCard();
        gate.pass();
    }
}
