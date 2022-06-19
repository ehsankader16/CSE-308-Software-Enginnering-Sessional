package assignment3b;

public abstract class BurgerOrderDecorator extends BurgerOrder {
    @Override
    public abstract String getOrderDetails();
    @Override
    public abstract int getPrice();
}
