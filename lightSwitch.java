package commandPattern;

import java.util.ArrayList;
import java.util.List;

public class lightSwitch //Invoker class managing lists of commands from the device Light
{
    private List<Command> commands = new ArrayList<>();

    public void pressSwitch(Command command)
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
