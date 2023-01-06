package observer.pattern.practice1;

import java.util.ArrayList;
import java.util.List;

public abstract class Stock {
    private String name;
    private double stockPrice;
    private int stockCount;
    protected List<Observer> observerList = new ArrayList<Observer>();
    public Stock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getStockPrice() {
        return this.stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyRegisteredUsers(this.name+"'s Stock price has been changed to "+ stockPrice);
    }

    public int getStockCount() {
        return this.stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
        notifyRegisteredUsers(this.name+"'s Stock count has been changed to "+ stockCount);
    }

    public abstract void register(Observer o);
    public abstract void unRegister(Observer o);
    public abstract void notifyRegisteredUsers(String msg);

}
