package problem1.components.displaysystem;

public class LcdSystem extends DisplaySystem {
    LcdSystem() {
        super("LCD Panel", 1000);
    }

    @Override
    public void displayInfo() {
        System.out.println("Component type: Display System");
        System.out.println("Name: " + super.getName());
        System.out.println("Price: " + super.getPrice());
    }
}
