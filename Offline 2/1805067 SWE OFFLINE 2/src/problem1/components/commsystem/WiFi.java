package problem1.components.commsystem;

public class WiFi extends CommSystem{
    WiFi() {
        super("WiFi", 8, 2000,8400);
    }

    @Override
    public void displayInfo() {
        System.out.println("Component type: Communication System");
        System.out.println("Communication channel: " + super.getName());
        System.out.println("Connection Speed: " + super.getInternetSpeed() + " Mbps");
        System.out.println("price: " + super.getPrice());
        System.out.println("Yearly Cost: " + super.getYearlyCost());
    }
}
