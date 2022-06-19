package assignment3b;

public class OnionRings extends BurgerOrderDecorator {
    BurgerOrder burgerOrder;

    public OnionRings(BurgerOrder burgerOrder) {
        this.burgerOrder = burgerOrder;
    }

    @Override
    public String getOrderDetails() {
        return burgerOrder.getOrderDetails() + " with Onion Rings";
    }

    @Override
    public int getPrice() {
        return burgerOrder.getPrice() + 100;
    }
}
