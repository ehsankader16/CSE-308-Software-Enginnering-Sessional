package assignment3b;

public class Water extends BurgerOrderDecorator {
    BurgerOrder burgerOrder;

    public Water(BurgerOrder burgerOrder) {
        this.burgerOrder = burgerOrder;
    }

    @Override
    public String getOrderDetails() {
        return burgerOrder.getOrderDetails() + " with Bottle of Water";
    }

    @Override
    public int getPrice() {
        return burgerOrder.getPrice() + 20;
    }
}
