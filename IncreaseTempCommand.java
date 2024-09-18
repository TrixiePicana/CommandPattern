package commandPattern;

public class IncreaseTempCommand implements Command //Implementing Concrete command class for Thermostat
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
