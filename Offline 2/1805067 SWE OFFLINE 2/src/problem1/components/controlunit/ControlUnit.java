package problem1.components.controlunit;

import problem1.components.Component;

public abstract class ControlUnit extends Component {
    private double clockSpeed;
    //private int displayUnitControl; //number of display system it can control
    ControlUnit(String name, double price, double clockSpeed) {
        super(name, price);
        this.clockSpeed = clockSpeed;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

//    public int getDisplayUnitControl() {
//        return displayUnitControl;
//    }

    public abstract void displayInfo();
}
