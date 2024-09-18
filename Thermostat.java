package commandPattern;

public class Thermostat //Receiver class
{
    private int temperature;
    public void increaseTemperature()
    {
        temperature = 30;
        System.out.println("The temperature rises at: " + temperature + " degrees Celsius.");
    }

    public void decreaseTemperature()
    {
        temperature = -9;
        System.out.println("The temperature falls at: " + temperature + " degrees Celsius.");
    }
}
