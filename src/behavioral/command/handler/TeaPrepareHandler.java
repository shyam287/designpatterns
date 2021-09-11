package behavioral.command.handler;

public class TeaPrepareHandler implements CommandHandler{
    @Override
    public void process(String ingredient) {
        System.out.println("preparing tea with ingredients: " + ingredient);
    }
}
