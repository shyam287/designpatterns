package behavioral.command;

import behavioral.command.handler.CommandHandler;

public class BeverageRequestProcessor {

    CommandHandler commandHandler;

    public void prepareBeverage(CommandReq req) {
        commandHandler = Command.commandToHandlerMapper.get(req.getCommand());
        commandHandler.process(req.getIngredients());
    }
}
