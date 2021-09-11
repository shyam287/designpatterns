package behavioral.command;

import behavioral.command.handler.CoffeePrepareHandler;
import behavioral.command.handler.CommandHandler;
import behavioral.command.handler.TeaPrepareHandler;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum Command {

    PREPARE_TEA("tea", new TeaPrepareHandler()),
    PREPARE_COFFEE("coffee",new CoffeePrepareHandler());

    private String beverageType;

    private CommandHandler commandHandler;

    public static Map<String, CommandHandler> commandToHandlerMapper = new HashMap<>();

    static {
        Arrays.stream(Command.values()).forEach(command -> commandToHandlerMapper.put(command.getBeverageType(), command.getCommandHandler()));
    }

    Command(String beverageType, CommandHandler commandHandler) {
        this.beverageType = beverageType;
        this.commandHandler = commandHandler;
    }

    public String getBeverageType() {
        return beverageType;
    }

    public CommandHandler getCommandHandler() {
        return commandHandler;
    }
}
