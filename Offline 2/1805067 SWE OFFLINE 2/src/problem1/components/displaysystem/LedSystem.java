package problem1.components.displaysystem;

public class LedSystem extends DisplaySystem {
    LedSystem() {
        super("LED matrix", 500);
    }

    @Override
    public void displayInfo() {
        System.out.println("Component type: Display System");
        System.out.println("Name: " + super.getName());
        System.out.println("Price: " + super.getPrice());
    }
}
