package commandPattern;

import java.util.ArrayList;
import java.util.List;

public class VidPlayRemote //Invoker class managing lists of commands from the device Video player
{
    private List<Command> commands = new ArrayList<>();

    public void adjustVolume(Command command)
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
