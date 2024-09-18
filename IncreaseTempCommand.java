package commandPattern;

public class IncreaseTempCommand implements Command //Concrete command class
{
    private Thermostat temperature;

    public IncreaseTempCommand (Thermostat temperature)
    {
        this.temperature = temperature;
    }

    @Override
    public void executeCommand()
    {
        temperature.increaseTemperature();
    }
}
