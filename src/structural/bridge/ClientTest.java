package structural.bridge;



public class ClientTest {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }


    public static void testDevice(Device device){
        System.out.println("testing basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("testing advanced remote");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
