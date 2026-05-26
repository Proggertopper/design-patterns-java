package creational.abstractFactory;

public class Application {
    Button button;
    Checkbox checkbox;

    public Application(AbstractFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.checkbox();
    }
}
