package problem1.components.appstore;


public class ApplicationFactory {

    public Application getApplication(String applicationType) {
        if (applicationType.equalsIgnoreCase("Controller App")) {
            return new ControllerApp();
        }
        return null;
    }
}
