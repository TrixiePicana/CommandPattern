package commandPattern;

public class DecreaseTempCommand implements Command //Implementing Concrete command class for Thermostat
{
    private Thermostat temperature;

    public DecreaseTempCommand (Thermostat temperature)
    {
        this.temperature = temperature;
    }

    @Override
    public void executeCommand()
    {
        temperature.decreaseTemperature();
    }
}
