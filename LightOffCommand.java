package commandPattern;

public class LightOffCommand implements Command //Concrete command class
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
