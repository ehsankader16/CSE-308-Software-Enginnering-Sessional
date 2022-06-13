package problem1.components.appstore;

import problem1.components.Component;

public abstract class Application extends Component {
    private String developer;

    Application(String name, double price, String developer) {
        super(name, price);
        this.developer = developer;
    }

    public String getDeveloper() {
        return developer;
    }
    public abstract void displayInfo();

}
