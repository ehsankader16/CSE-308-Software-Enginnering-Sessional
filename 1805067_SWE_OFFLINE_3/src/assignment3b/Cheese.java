package assignment3b;

public class Cheese extends BurgerOrderDecorator {
    BurgerOrder burgerOrder;

    public Cheese(BurgerOrder burgerOrder) {
        this.burgerOrder = burgerOrder;
    }

    @Override
    public String getOrderDetails() {
        return burgerOrder.getOrderDetails() + " with Cheese";
    }

    @Override
    public int getPrice() {
        return burgerOrder.getPrice() + 100;
    }
}
