package problem1.components.commsystem;

public class MobileData extends CommSystem {

    MobileData() {
        super("Mobile Data", 5, 200, 6000);
    }

    @Override
    public void displayInfo() {
        System.out.println("Component type: Communication System");
        System.out.println("Communication channel: " + super.getName());
        System.out.println("Connection Speed: " + super.getInternetSpeed() + " Mbps");
        System.out.println("Price: " + super.getPrice());
        System.out.println("Yearly Cost: " + super.getYearlyCost());
    }
}
