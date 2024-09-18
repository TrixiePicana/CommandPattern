package commandPattern;


public class centralHub //Client class
{
    public static void main(String[] args)
    {

        Light livingRoomLight = new Light();
        Thermostat temperature = new Thermostat();
        Videoplayer_in_PC volume = new Videoplayer_in_PC();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command increaseTemperature = new IncreaseTempCommand(temperature);
        Command decreaseTemperature = new DecreaseTempCommand(temperature);
        Command increaseVolume = new IncreaseVolCommand(volume);
        Command decreaseVolume = new DecreaseVolCommand(volume);

        lightSwitch button = new lightSwitch();
        button.pressSwitch(lightOn);
        button.pressSwitch(lightOff);

        RemoteControl thermostatButton = new RemoteControl();
        thermostatButton.pressButton(increaseTemperature);
        thermostatButton.pressButton(decreaseTemperature);

        VidPlayRemote mouse = new VidPlayRemote();
        mouse.adjustVolume(increaseVolume);
        mouse.adjustVolume(decreaseVolume);

        button.executeCommands();
        thermostatButton.executeCommands();
        mouse.executeCommands();
    }

}
