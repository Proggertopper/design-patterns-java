package behavioral.state;

public class Gate {
    private GateState state;

    public Gate(){
        state = new LockedState();
    }

    public void changeState(GateState state){
        this.state = state;
    }

    public void pass(){
        state.pass(this);
    }

    public void insertCard(){
        state.insertCard(this);
    }
}
