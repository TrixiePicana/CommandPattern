package commandPattern;

public class IncreaseVolCommand implements Command //Implementing Concrete Command for the device video player
{
    private Videoplayer_in_PC videoplayer;

    public IncreaseVolCommand (Videoplayer_in_PC videoplayer)
    {
        this.videoplayer = videoplayer;
    }

    @Override
    public void executeCommand()
    {
        videoplayer.increaseVolume();
    }
}
