package commandPattern;

public class LightOnCommand implements Command //Concrete command class
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
