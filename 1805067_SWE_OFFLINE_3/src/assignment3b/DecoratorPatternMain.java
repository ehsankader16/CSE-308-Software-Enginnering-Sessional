package assignment3b;


public class DecoratorPatternMain {
    public static void main(String[] args) {
        BurgerOrder beefBurgerOrder = new BeefBurger();
        System.out.println(beefBurgerOrder.getOrderDetails());
        System.out.println("Total cost " + beefBurgerOrder.getPrice());

        beefBurgerOrder = new FrenchFries(beefBurgerOrder);
        beefBurgerOrder = new Cheese(beefBurgerOrder);
        System.out.println(beefBurgerOrder.getOrderDetails());
        System.out.println("Total cost " + beefBurgerOrder.getPrice());

        BurgerOrder veggyBurgerOrder = new VeggyBurger();
        veggyBurgerOrder = new OnionRings(veggyBurgerOrder);
        veggyBurgerOrder = new Water(veggyBurgerOrder);
        System.out.println(veggyBurgerOrder.getOrderDetails());
        System.out.println("Total cost " + veggyBurgerOrder.getPrice());
    }
}