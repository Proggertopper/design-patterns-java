package behavioral.visitor;

public interface Visitor {
    void visitComputer(Computer computer);
    void visitServer(Server server);
}
