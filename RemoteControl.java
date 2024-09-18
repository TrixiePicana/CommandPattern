package commandPattern;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl //Invoker class managing lists of commands from the device Thermostat
{
    private List<Command> commands = new ArrayList<>();

    public void pressButton(Command command)
    {
        commands.add(command);
    }

    public void executeCommands()
    {
        for (Command command : commands)
        {
            command.executeCommand();
        }
        commands.clear(); // Clear commands after execution

    }
}

