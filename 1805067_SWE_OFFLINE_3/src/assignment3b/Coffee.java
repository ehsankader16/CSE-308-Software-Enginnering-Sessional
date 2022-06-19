package assignment3b;

public class Coffee extends BurgerOrderDecorator {
    BurgerOrder burgerOrder;

    public Coffee(BurgerOrder burgerOrder) {
        this.burgerOrder = burgerOrder;
    }

    @Override
    public String getOrderDetails() {
        return burgerOrder.getOrderDetails() + " with Coffee";
    }

    @Override
    public int getPrice() {
        return burgerOrder.getPrice() + 120;
    }
}
