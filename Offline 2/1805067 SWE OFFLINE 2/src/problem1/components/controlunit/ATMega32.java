package problem1.components.controlunit;

public class ATMega32 extends ControlUnit{
    ATMega32() {
        super("ATMega32", 200, 1.2);
    }

    @Override
    public void displayInfo() {
        System.out.println("Component type: Control Unit");
        System.out.println("Name: " + super.getName());
        System.out.println("Clock Speed: " + super.getClockSpeed() + " GHz");
        System.out.println("Internal Static RAM: 2KB");
        System.out.println("Operating voltage: Between 1.8-5.5 V");
        System.out.println("Price: " + super.getPrice());
    }
}
