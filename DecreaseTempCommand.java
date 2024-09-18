package commandPattern;

public class DecreaseTempCommand implements Command //Concrete Command Class
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
