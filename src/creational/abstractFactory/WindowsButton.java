package creational.abstractFactory;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Кнопка винды йохоу!");
    }
}
