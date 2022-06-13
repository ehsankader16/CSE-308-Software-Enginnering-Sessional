package problem1.components.controlunit;

public class RaspberryPi extends ControlUnit {
    RaspberryPi() {
        super("Raspberry PI", 4375, 1);
    }

    @Override
    public void displayInfo() {
        System.out.println("Component type: Control Unit");
        System.out.println("Name: " + super.getName());
        System.out.println("Clock Speed: " + super.getClockSpeed() + " GHz");
        System.out.println("Ram: 512 MB");
        System.out.println("Price: " + super.getPrice());
    }
}
