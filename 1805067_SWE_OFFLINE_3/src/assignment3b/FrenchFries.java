package assignment3b;

public class FrenchFries extends BurgerOrderDecorator {
    BurgerOrder burgerOrder;

    public FrenchFries(BurgerOrder burgerOrder) {
        this.burgerOrder = burgerOrder;
    }

    @Override
    public String getOrderDetails() {
        return burgerOrder.getOrderDetails() + " with French Fries";
    }

    @Override
    public int getPrice() {
        return burgerOrder.getPrice() + 100;
    }

}
