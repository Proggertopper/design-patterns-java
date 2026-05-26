package behavioral.visitor;

public class Computer implements Element{

    public String getModel(){
        return "MacBook Pro";
    }

    public void accept(Visitor visitor){
        visitor.visitComputer(this);
    }
}
