package problem1.components.appstore;

public class ControllerApp extends Application{
    ControllerApp() {
        super("Controller App", 500,"Dunder Mifflin");
    }

    @Override
    public void displayInfo() {
        System.out.println("Component type: Controller Application");
        System.out.println("Name: " + super.getName());
        System.out.println("Developed By: " + super.getDeveloper());
        System.out.println("Price: " + super.getPrice());
    }
}
