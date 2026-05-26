package behavioral.mediator;

public abstract class Component {
    protected HomeMediator mediator;

    public void setMediator(HomeMediator mediator) {
        this.mediator = mediator;
    }
}
