package behavioral.command;

public class RemoteControl {
    private Command slot;
    private Command lastCommand;

    public void setCommand(Command command){
        this.slot = command;
    }

    public void pressButton(){
        slot.execute();
        lastCommand = slot;
    }

    public void pressUndoButton(){
        if(lastCommand != null){
            System.out.print("Отмена ");
            lastCommand.undo();
        }
    }
}
