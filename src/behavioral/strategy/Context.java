package behavioral.strategy;

public class Context {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeRoute(String from , String to){
        if(strategy == null){
            System.out.println("Ошибка ! Выберете способ передвижения");
            return;
        }
        strategy.buildRoute(from , to);
    }
}
