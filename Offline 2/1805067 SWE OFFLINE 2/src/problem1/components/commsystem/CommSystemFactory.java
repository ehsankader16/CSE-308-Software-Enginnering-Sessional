package problem1.components.commsystem;
public class CommSystemFactory {
    public CommSystem getCommSystem(String commSystemType) {
        if (commSystemType.equalsIgnoreCase("Mobile Data")) {
            return new MobileData();
        } else if (commSystemType.equalsIgnoreCase("WiFi")) {
            return new WiFi();
        }
        return null;
    }
}
