package commandPattern;

public class LightOnCommand implements Command //Implementing Concrete Command for device Light
{
    private Light light;

    public LightOnCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void executeCommand()
    {
        light.turnOn();
    }
}
