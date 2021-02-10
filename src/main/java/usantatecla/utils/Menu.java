package usantatecla.utils;

import java.util.ArrayList;
import java.util.List;

public abstract class Menu {

    private List<Command> commandList;
    private String title;

    protected Menu(String title) {
        this.title = title;
        commandList = new ArrayList<>();
    }

    public void execute() {
        List<Command> activeCommands = getActiveCommands();
        Console console = new Console();
        boolean error = false;
        int option;
        do {
            console.writeln(this.title);
            printCommands(activeCommands);
            option = console.readInt("");
            if (!new ClosedInterval(1, activeCommands.size()).includes(option)) {
                error = true;
            }
        } while (error);
        activeCommands.get(option - 1).execute();
    }

    private List<Command> getActiveCommands() {
        List<Command> result = new ArrayList<>();
        for (Command command : commandList) {
            if (command.isActive()) {
                result.add(command);
            }
        }
        return result;
    }

    private void printCommands(List<Command> commands) {
        Console console = new Console();
        for (int i = 0; i < commands.size(); i++) {
            console.writeln(String.format("%s. %s", i + 1, commands.get(i).getTitle()));
        }
    }

    public void addCommand(Command command) {
        this.commandList.add(command);
    }
}
