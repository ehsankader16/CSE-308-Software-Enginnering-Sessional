package problem1.components.commsystem;

import problem1.components.Component;

public abstract class CommSystem extends Component {
    private double internetSpeed;
    private double yearlyCost;

    CommSystem(String name, double internetSpeed, double price, double yearlyCost) {
        super(name, price);
        this.internetSpeed = internetSpeed;
        this.yearlyCost = yearlyCost;
    }

    public double getInternetSpeed() {
        return internetSpeed;
    }

    public double getYearlyCost() {
        return yearlyCost;
    }

    public abstract void displayInfo();
}
