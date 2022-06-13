package problem1.components.displaysystem;

import problem1.components.Component;

public abstract class DisplaySystem extends Component {

    DisplaySystem(String name, double price) {
        super(name, price);
    }

    public abstract void displayInfo();
}
