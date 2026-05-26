package behavioral.memento;

import java.util.Stack;

public class History {
    private final Stack<TextEditor.Snapshot> history = new Stack<>();

    public void push(TextEditor.Snapshot snapshot){
        history.push(snapshot);
    }

    public TextEditor.Snapshot pop(){
        if(!history.isEmpty()){
            return history.pop();
        }
        return null;
    }
}
