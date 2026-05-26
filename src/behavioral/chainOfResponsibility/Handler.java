package behavioral.chainOfResponsibility;

public abstract class Handler {
    protected Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(String message);
}
