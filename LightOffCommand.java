package commandPattern;

public class LightOffCommand implements Command //Implementing Concrete Command for device Light
{
    private Light light;

    public LightOffCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void executeCommand()
    {
        light.turnOff();
    }
}
