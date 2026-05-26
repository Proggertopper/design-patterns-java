package behavioral.memento;

public class TestClient {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setText("1 версия без ошибок");
        history.push(editor.save());

        editor.setText("2 версия с ошибками");

        System.out.println("Сейчас в редакторе "+ editor.getText());

        TextEditor.Snapshot previousState = history.pop();
        if(previousState != null){
            editor.restore(previousState);
        }
        System.out.println("После отмены " + editor.getText());
    }
}
