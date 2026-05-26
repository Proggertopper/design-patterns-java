package creational.abstractFactory;

public class TestClient {
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

    public static Application configureApplication(){
        Application app;
        AbstractFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        System.out.println(System.getProperty("os.name"));
        if(osName.contains("mac")){
            factory = new MacOsFactory();
        }
        else
            factory = new WindowsFactory();

        app = new Application(factory);
        return app;
    }
}
