package problem1.components.controlunit;

public class ArduinoMega extends ControlUnit{
    ArduinoMega() {
        super("ArduinoMega", 2000, 1.2);
    }

    @Override
    public void displayInfo() {
        System.out.println("Component type: Control Unit");
        System.out.println("Name: " + super.getName());
        System.out.println("Clock Speed: " + super.getClockSpeed() + " GHz");
        System.out.println("Flash Memory: 256 KB");
        System.out.println("Operating voltage: 5 V");
        System.out.println("Price: " + super.getPrice());
    }
}
