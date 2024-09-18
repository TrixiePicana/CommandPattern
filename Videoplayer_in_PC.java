package commandPattern;

public class Videoplayer_in_PC //Receiver class
{
    private int volume;
    public void increaseVolume()
    {
        volume = 50;
        System.out.println("The user increases the volume at " + volume + " .");
    }

    public void decreaseVolume()
    {
        volume = 10;
        System.out.println("The user decreases the volume at " + volume + " .");
    }
}
