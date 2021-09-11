package behavioral.command.handler;

public class CoffeePrepareHandler implements CommandHandler{

    @Override
    public void process(String ingredient) {
        System.out.println("preparing Coffee with ingredients: "+ ingredient);
    }
}
