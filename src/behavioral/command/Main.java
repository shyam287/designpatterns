package behavioral.command;

public class Main {

    public static void main(String[] args) {
        BeverageRequestProcessor beverageRequestProcessor = new BeverageRequestProcessor();

        CommandReq teaCommand = new CommandReq();
        teaCommand.setCommand("tea");
        teaCommand.setIngredients("tea ingredients");
        beverageRequestProcessor.prepareBeverage(teaCommand);

        CommandReq coffeeCommand = new CommandReq();
        coffeeCommand.setCommand("coffee");
        coffeeCommand.setIngredients("coffee ingredients");

        beverageRequestProcessor.prepareBeverage(coffeeCommand);
    }
}
