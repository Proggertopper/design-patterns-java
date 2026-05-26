package behavioral.memento;

public class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Snapshot save(){
        return new Snapshot(text);
    }

    public void restore(Snapshot snapshot){
        this.text = snapshot.getSavedText();
    }

    public static class Snapshot {
        private final String text;

        private Snapshot(String text){
            this.text = text;
        }

        public String getSavedText(){
            return text;
        }
    }
}
