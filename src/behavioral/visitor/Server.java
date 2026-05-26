package behavioral.visitor;

public class Server implements Element{

    public int getCpuCores(){
        return 64;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitServer(this);
    }
}
