package commandPattern;

public class DecreaseVolCommand implements Command //Implementing Concrete Command for the device video player
{
    private Videoplayer_in_PC videoplayer;

    public DecreaseVolCommand (Videoplayer_in_PC videoplayer)
    {
        this.videoplayer = videoplayer;
    }

    @Override
    public void executeCommand()
    {
        videoplayer.decreaseVolume();
    }


}
