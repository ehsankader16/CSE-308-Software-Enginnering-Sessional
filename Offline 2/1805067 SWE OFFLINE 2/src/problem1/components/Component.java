package problem1.components;

public abstract class Component {
    private String name;
    private double price;
    public Component(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public abstract void displayInfo();
}
