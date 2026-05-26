package creational.prototype;

public class TestClient {
    public static void main(String[] args) {
        Archer archer = new Archer(20 , 30 , 40);
        Archer archer2 = (Archer) archer.clone();
        System.out.println(archer == archer2);
        System.out.println(archer.equals(archer2));
    }
}
