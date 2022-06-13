package problem1.components.controlunit;

public class ControlUnitFactory {
    public ControlUnit getControlUnit(String controlUnitType) {
        if (controlUnitType.equalsIgnoreCase("ATMega32")) {
            return new ATMega32();
        } else if (controlUnitType.equalsIgnoreCase("Arduino Mega")) {
            return new ArduinoMega();
        } else if (controlUnitType.equalsIgnoreCase("Raspberry PI")) {
            return new RaspberryPi();
        }
        return null;
    }
}
