package observer.pattern.practice1;

public class ObserverPatternMain1 {
    public static void main(String[] args) {
        Stock stock = new ConcreteStock("p1");
        Observer observer = new User("Farid");

        stock.register(observer);
        stock.setStockPrice(3.00);
        stock.setStockCount(5);
    }
}
