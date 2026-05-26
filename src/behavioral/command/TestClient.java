package behavioral.command;

public class TestClient {
    public static void main(String[] args) {
        Light light = new Light();
        MusicPlayer musicPlayer = new MusicPlayer();

        Command lightOn = new LightOnCommand(light);
        Command playMusic = new MusicPlayCommand(musicPlayer);

        RemoteControl control = new RemoteControl();

        System.out.println("--- Управляем светом ---");
        control.setCommand(lightOn);
        control.pressButton();
        control.pressUndoButton();

        System.out.println("--- Переключаеєм пульт на музыку ---");
        control.setCommand(playMusic);
        control.pressButton();
        control.pressUndoButton();
    }
}
