package behavioral.command;

public class MusicPlayCommand implements Command{
    private MusicPlayer musicPlayer;

    public MusicPlayCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.play();
    }

    @Override
    public void undo() {
        musicPlayer.stop();
    }
}
