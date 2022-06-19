package assignment3b;

public class Coke extends BurgerOrderDecorator {
    BurgerOrder burgerOrder;

    public Coke(BurgerOrder burgerOrder) {
        this.burgerOrder = burgerOrder;
    }

    @Override
    public String getOrderDetails() {
        return burgerOrder.getOrderDetails() + " with Coke";
    }

    @Override
    public int getPrice() {
        return burgerOrder.getPrice() + 40;
    }
}
